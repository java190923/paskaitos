package com.vcs.lects.l03.integers;

public class Kabliukas {

	public static void main(String[] args) {
		Kabliukas k = new Kabliukas();
		System.out.println(k.vidurkis_01(10, 3));
	}

	public double vidurkis_01(double suma, double kiekis) {
		return suma / kiekis;
	}
	
	public double vidurkis_02(int suma, int kiekis) {
		return (double)suma / (double)kiekis;
	}
	
	public double vidurkis_03(int suma, int kiekis) {
		return (suma * 1.0) / kiekis;
	}

}
