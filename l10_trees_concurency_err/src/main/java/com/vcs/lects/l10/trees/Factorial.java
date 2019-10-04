package com.vcs.lects.l10.trees;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(new Factorial().factorial(15));

	}

	private int factorial(int nr) {

		if (nr > 1) {
			return nr * factorial(nr - 1);
		}

		return 1;
	}

}
