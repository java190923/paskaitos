package com.vcs.lects.l03.pojo;

public class Statybos {

	public Namas pastatemNama() {
		Namas n1 = new Namas();

		n1.setAdresas("vejo g. 5");
		n1.setSildymas(false);
		n1.setRusys(true);

		return n1;
	}

	public void irengtiSildyma(Namas namasBeSildymo) {

		namasBeSildymo.setSildymas(true);

	}

}
