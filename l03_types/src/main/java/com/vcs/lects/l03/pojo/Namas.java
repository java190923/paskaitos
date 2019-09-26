package com.vcs.lects.l03.pojo;

public class Namas {

	private String adresas;
	private boolean rusys;
	private Boolean sildymas;

	public Boolean getSildymas() {
		return sildymas;
	}

	public boolean isRusys() {
		return rusys;
	}

	public void setSildymas(Boolean sildymas) {
		
		this.sildymas = sildymas;
	}

	public String getAdresas() {
		return adresas;
	}

	public void setAdresas(String adresas) {
		this.adresas = adresas;
	}

	public void setRusys(boolean rusys) {
		this.rusys = rusys;
	}

}
