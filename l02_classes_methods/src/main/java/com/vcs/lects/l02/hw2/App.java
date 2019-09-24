package com.vcs.lects.l02.hw2;

public class App {

	/**
	 * @param args - console params
	 */
	public static void main(String[] args) {

		SayHi s = new SayHi();
		System.out.println(s.sayHi());
		
		JavaDocEx sad = new JavaDocEx();

	}

	private int sk3 = 4;

//	private void mmm() {
//		// TODO Auto-generated method stub
//
//		metodas();
//		metodas22(56);
//
//	}

	private int metodas() {

		int sk1 = 6;

		return sk3 + sk1;

	}

	private int metodas22(int sk4) {

		int sk1 = 6;

		return sk3 + sk1 + sk4;

	}

}
