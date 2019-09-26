package com.vcs.lects.l03.integers;

public class Integers {

	public static void main(String[] args) {
		Integers asd = new Integers();
		//asd.integersMethod();
		asd.goodVersion();

		
	}

	private void integersMethod() {

		char raide1 = '\n';

		System.out.println((int) raide1);

	}

	private void wrongVersion() {
		byte atstumas = 5;

		long tukstKm = atstumas * 1000 * 1000 * 1000;
		long kilometras = atstumas * 1000 * 1000;
		long metras = atstumas * 1000;
		long milimetras = atstumas;

		System.out.println(tukstKm);
		System.out.println(kilometras);
		System.out.println(metras);
		System.out.println(milimetras);

	}

	private void goodVersion() {
		long atstumas = 5;

		long milimetras = atstumas;
		long metras = milimetras * 1000L;
		long kilometras = metras * 1000L;
		long tukstKm = kilometras * 1000L;

		System.out.println(tukstKm);
		System.out.println(kilometras);
		System.out.println(metras);
		System.out.println(milimetras);

	}

}
