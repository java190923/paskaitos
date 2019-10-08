package com.vcs.lects.l05.tasks;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
public class KaroliukaiBenchamrkTest {
    private static final char EMPTY = ' ';

    @Benchmark
    public void benchmarkDainius(KState st) {
        st.k1.rotateClockwise(st.d, EMPTY, 10000);
    }

    @Benchmark
    public void benchmarkMartynas(KState st) {
        st.k2.rotateClockwise(st.d, EMPTY, 10000);
    }

    @State(Scope.Thread)
    public static class KState {
        public char[][] d = null;

        public Karoliukai k1 = new KaroliukaiDainiusImpl();
        public Karoliukai k2 = new KaroliukaiMartynasImpl();


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
