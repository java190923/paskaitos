package com.vcs.lects.l05.tasks;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(1)
public class KaroliukaiBenchamrkTest {
	private static final char EMPTY = ' ';

	@State(Scope.Thread)
	public static class KState {
		public char[][] d = null;

		public Karoliukai k1 = new Karoliukai();


		@Setup(Level.Trial)
		public void doSetup() {

			char[][] d = { { EMPTY, '0', EMPTY, '0', '0', EMPTY, '0', EMPTY, '0', '0' },
					{ '0', EMPTY, '0', '0', '0', '0', EMPTY, '0', '0', '0' },
					{ '0', EMPTY, EMPTY, '0', EMPTY, '0', EMPTY, EMPTY, '0', EMPTY },
					{ EMPTY, EMPTY, '0', EMPTY, EMPTY, EMPTY, EMPTY, '0', EMPTY, EMPTY },
					{ EMPTY, '0', '0', EMPTY, EMPTY, EMPTY, '0', '0', EMPTY, EMPTY },
					{ EMPTY, '0', EMPTY, '0', '0', EMPTY, '0', EMPTY, '0', '0' },
					{ '0', EMPTY, '0', '0', '0', '0', EMPTY, '0', '0', '0' },
					{ '0', EMPTY, EMPTY, '0', EMPTY, '0', EMPTY, EMPTY, '0', EMPTY },
					{ EMPTY, EMPTY, '0', EMPTY, EMPTY, EMPTY, EMPTY, '0', EMPTY, EMPTY },
					{ EMPTY, '0', '0', EMPTY, EMPTY, EMPTY, '0', '0', EMPTY, EMPTY } };

			this.d = d;
			System.out.println("Do Setup");
		}
	}

	@Benchmark
	public void benchmark1(KState st) {
		st.k1.rotateClockwise(st.d, EMPTY, 10000);
	}


}
