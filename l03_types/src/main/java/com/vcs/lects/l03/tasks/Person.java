package com.vcs.lects.l03.tasks;

public class Person {

	// Asmens ID bet kokioje sistemoje
	private String id;

	// Vardas
	private String name;

	// Pavardė
	private String surname;

	// Asmens kodas
	private String ak;

	// Gimimo metai
	private Integer bYear;

	// Lytis
	private Gender gender;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	public Integer getbYear() {
		return bYear;
	}

	public void setbYear(Integer bYear) {
		this.bYear = bYear;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
