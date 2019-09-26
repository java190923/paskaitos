package com.vcs.lects.l04.operators.tasks;

public class AritmetineProgresijaTest {

	public static void main(String[] args) {

		AritmetineProgresija a = new AritmetineProgresija();

		System.out.println(Double.compare(a.formule(1, 2, 3), 9.0) == 0 ? "Ok" : "Fail");
		System.out.println(Double.compare(a.formule(100, 200, 300), 9000000.0) == 0 ? "Ok" : "Fail");
		System.out.println(Double.compare(a.formule(0, 1.5, 2), 1.5) == 0 ? "Ok" : "Fail");

	}

}
