package com.vcs.lects.l05.tasks;

public class PersonFromString {

	public static void main(String[] args) {
		PersonFromString pc = new PersonFromString();

		Person ona = pc.personFromString("Ona Onute 4485465456 1984 mot");

		System.out.println(ona.getVardas());
		System.out.println(ona.getPavarde());
		System.out.println(ona.getGimMetai());
		System.out.println(ona.getLytis());

	}

	public Person personFromString(String strData) {

		// TODO

		return null;
	}

}
