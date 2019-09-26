package com.vcs.lects.l04.tasks;

public class AritmetineProgresija {

	/**
	 * <pre>
			2*a + d(n-1)
		s = -------------- * n
				2
	 * 
	 * </pre>
	 * 
	 */

	public double formule(double a, double d, double n) {
		return ((2 * a + d * (n - 1)) * n) / 2;
	}

}
