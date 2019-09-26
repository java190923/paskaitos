package com.vcs.lects.l04.operators.tasks;

public class SultysTest {

	public static void main(String[] args) {

		Sultys s = new Sultys();

		System.out.println(s.arNeraLikucio(6, 3, false) ? "Ok" : "Fail");
		System.out.println(s.arNeraLikucio(6, 3, true) ? "Ok" : "Fail");

		System.out.println(!s.arNeraLikucio(5, 2, true) ? "Ok" : "Fail");
		System.out.println(!s.arNeraLikucio(5, 2, false) ? "Ok" : "Fail");

		System.out.println(!s.arNeraLikucio(9, 3, true) ? "Ok" : "Fail");
	}
}
