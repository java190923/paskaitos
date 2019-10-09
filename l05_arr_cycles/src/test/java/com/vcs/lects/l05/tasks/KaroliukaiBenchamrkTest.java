package com.vcs.lects.l05.tasks;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
public class KaroliukaiBenchamrkTest {
    private static final char EMPTY = ' ';

    private static final int ROTATE_COUNT = 10000;

    @Benchmark
    public void benchmarkDainius(KState st) {
        st.k1.rotateClockwise(st.d, EMPTY, ROTATE_COUNT);
    }

    @Benchmark
    public void benchmarkMartynas(KState st) {
        st.k2.rotateClockwise(st.d, EMPTY, ROTATE_COUNT);
    }

    @Benchmark
    public void benchmarkDefault(KState st) {
        st.k3.rotateClockwise(st.d, EMPTY, ROTATE_COUNT);
    }

    @Benchmark
    public void benchmarkTuned(KState st) {
        st.k4.rotateClockwise(st.d, EMPTY, ROTATE_COUNT);
    }

    @State(Scope.Thread)
    public static class KState {
        public char[][] d = null;

        public Karoliukai k1 = new KaroliukaiDainiusImpl();
        public Karoliukai k2 = new KaroliukaiMartynasImpl();
        public Karoliukai k3 = new KaroliukaiImpl();
        public Karoliukai k4 = new KaroliukaiTunedImpl();


        @Setup(Level.Trial)
        public void doSetup() {

            char[][] d = {{EMPTY, '0', EMPTY, '0', '0', EMPTY, '0', EMPTY, '0', '0'},
                    {'0', EMPTY, '0', '0', '0', '0', EMPTY, '0', '0', '0'},
                    {'0', EMPTY, EMPTY, '0', EMPTY, '0', EMPTY, EMPTY, '0', EMPTY},
                    {EMPTY, EMPTY, '0', EMPTY, EMPTY, EMPTY, EMPTY, '0', EMPTY, EMPTY},
                    {EMPTY, '0', '0', EMPTY, EMPTY, EMPTY, '0', '0', EMPTY, EMPTY},
                    {EMPTY, '0', EMPTY, '0', '0', EMPTY, '0', EMPTY, '0', '0'},
                    {'0', EMPTY, '0', '0', '0', '0', EMPTY, '0', '0', '0'},
                    {'0', EMPTY, EMPTY, '0', EMPTY, '0', EMPTY, EMPTY, '0', EMPTY},
                    {EMPTY, EMPTY, '0', EMPTY, EMPTY, EMPTY, EMPTY, '0', EMPTY, EMPTY},
                    {EMPTY, '0', '0', EMPTY, EMPTY, EMPTY, '0', '0', EMPTY, EMPTY}};

            this.d = d;
            System.out.println("Do Setup");
        }
    }


}
