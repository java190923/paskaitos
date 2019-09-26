package com.vcs.lects.l03.pojo;

public class RealWorld {

	public static void main(String[] args) {

		Statybos st = new Statybos();
		Namas house = st.pastatemNama();
		System.out.println(house.getAdresas());
		System.out.println("Sildymas: " + house.getSildymas());

		System.out.println("Santechnikas Jonas ateina i \"objekta\"..." + house.getAdresas());

		st.irengtiSildyma(house);

		System.out.println("Bus siltos Kaledos ... siemet? : " + house.getSildymas());

	}
}
