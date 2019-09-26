package com.vcs.lects.l03.integers;

import java.util.Locale;

public class JavaTypes {

	public static void main(String[] args) {

		System.out.println((byte) 131);

		double d = 0.000000000001234567890456;
		System.out.println(d);

		String sk = "1,000.000";

		System.out.println("utf8 \\u2700 \u2745");
	}

	private void integers() {

		int sk = 6;

		Integer sk2 = Integer.MAX_VALUE;

		sk2 = sk + sk2;

		sk2 = null;

		Double a = 100.0 + sk2;

	}

}
