package com.vcs.lects.l04.tasks;

import com.vcs.lects.l04.tasks.Sultys;

public class SultysTest {

	public static void main(String[] args) {

		Sultys s = new Sultys();

		System.out.println(s.arNeraLikucio_2(6, 3, false) ? "Ok" : "Fail");
		System.out.println(s.arNeraLikucio_2(6, 3, true) ? "Ok" : "Fail");

		System.out.println(!s.arNeraLikucio_2(5, 2, true) ? "Ok" : "Fail");
		System.out.println(!s.arNeraLikucio_2(5, 2, false) ? "Ok" : "Fail");

		System.out.println(!s.arNeraLikucio_2(9, 3, true) ? "Ok" : "Fail");
	}
}
