package com.vcs.lects.l09.tasks;

import com.vcs.lects.l09.tasks.reordering.IReordering;
import com.vcs.lects.l09.tasks.reordering.Mokinys;
import org.openjdk.jmh.annotations.*;

import java.util.*;
import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
public class ReorderingTest {

    private static final int GROUPS_COUNT = 15000;
    private static final int GROUP_SIZE = 150;

    @Benchmark
    public void benchmarkDefault(KState st) {
        st.k[0].getReordered(st.d);
    }

    @Benchmark
    public void benchmarkFast(KState st) {
        st.k[1].getReordered(st.d);
    }

    @State(Scope.Thread)
    public static class KState {
        public Map<String, List<Mokinys>> d = new HashMap<>();
        public IReordering[] k = {
                //new ReorderingFunctional(), new ReorderingFast()
        };
        private Random rnd = new Random();

        @Setup(Level.Trial)
        public void doSetup() {
            List<Mokinys> data = null;

            for (int i = 0; i < GROUPS_COUNT; i++) {
                data = new ArrayList<>();
                for (int j = 0; j < GROUP_SIZE; j++) {
                    data.add(new Mokinys("" + i + j, avg(rnd, i)));
                }
                d.put("" + i, data);
            }

            System.out.println("Do Setup");
        }

        private double avg(Random rnd, int i) {
            rnd.setSeed(Integer.MAX_VALUE - i);
            double vid = ((double) rnd.nextInt(110)) / 10;
            return vid > 10.0 ? 10.0 : vid;
        }
    }


}
