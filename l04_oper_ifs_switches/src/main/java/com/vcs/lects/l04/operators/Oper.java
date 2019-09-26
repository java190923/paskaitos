package com.vcs.lects.l04.operators;

public class Oper {

	public static void main(String[] args) {

		double a = 10.0;
		double b = 3.7;

		System.out.println(a % b);

	}

	private void oper() {
		// TODO Auto-generated method stub

		int a = 6;

		a = a + 12;
		a += 12;

		a = a + 1;
		a += 1; // a = a + 1;
		a++; // a= a + 1;

		a -= 4; // a= a - 4;
		a--; // a = a - 1;

		/**
		 * Daugyba dalyba
		 */

		a = 16;

		a /= 5; // sveikosios dalys yra 3: 16 / 5 = 3

		a = 13;

		a = a % 3; // ats: 1
		a %= 3;

	}

	private boolean arLyginis(int sk) {

		return sk % 2 == 0;
	}

	private boolean arNelyginis01(int sk) {
		return sk % 2 != 0;
	}

	private boolean arNelyginis02(int sk) {
		return sk % 2 == 1;
	}

	private boolean arNelyginis03(int sk) {
		return !arLyginis(sk);
	}

}
