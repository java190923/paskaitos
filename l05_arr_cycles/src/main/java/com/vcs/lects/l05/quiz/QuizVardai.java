package com.vcs.lects.l05.quiz;

public class QuizVardai {

	public static void main(String[] args) {

		QuizVardai q = new QuizVardai();
		q.vardaiIEktrana();

	}

	private void vardaiIEktrana() {

		String[] vardai = { "Justina", "Andrius", "Mindaugas", "Arminas", "Martynas", "Tomas" };

		System.out.println();
		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[i]);
		}

		System.out.println();
		for (int i = vardai.length - 1; i >= 0; i--) {
			System.out.println("Vardas    : " + vardai[i]);
		}

		System.out.println();
		for (int i = vardai.length; i > 0; i--) {
			System.out.println("Vardas    : " + vardai[i - 1]);
		}

		System.out.println();
		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[vardai.length - 1 - i]);
		}
		
		for (String v : vardai) {
			System.out.println("Vardas    : " + v);
		}
		
		for (String vardas: vardai) {
		       System.out.println("Vardas    : " + vardas);
		}


	}

}
