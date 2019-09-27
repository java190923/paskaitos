package com.vcs.lects.l05.tasks;

import java.util.Arrays;

public class SortTask {

	// Pradiniu duomenu pvz
	// "3242 43 22222 34 1111111 234 234"

	public static void main(String[] args) {
		SortTask st = new SortTask();

		String data = "3242 43 22222 34 1111111 234 234";

		int[] sortedInts = st.sort(data, true);
		System.out.println(Arrays.toString(sortedInts));

		sortedInts = st.sort(data, false);
		System.out.println(Arrays.toString(sortedInts));

	}

	public int[] sort(String strData, boolean asc) {

		// TODO
		return null;
	}

}
