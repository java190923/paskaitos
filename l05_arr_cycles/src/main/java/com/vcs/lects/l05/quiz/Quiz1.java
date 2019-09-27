package com.vcs.lects.l05.quiz;

import java.util.Arrays;

public class Quiz1 {

	public static void main(String[] args) {

		Quiz1 q = new Quiz1();
		int[] arr = { 5, 7, 8, 90, 1, 2, 4, 45, 5 };
		q.printIntsObj(arr);
		q.printInts(arr);

	}
	
	public void printIntsObj(int[] ints) {
		System.out.println(ints);
	}

	public void printInts(int[] ints) {
		System.out.println(Arrays.toString(ints));
	}

	public Person getLast(Person[] persons) {
		return persons[persons.length - 1];
	}
	

}
