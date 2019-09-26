package com.vcs.lects.l04.tasks;

import com.vcs.lects.l04.tasks.SizeConverter;

public class SizeConverterTest {
	
	private static final long TB = 1099511627776L;
	private static final long GB = 1073741824;
	private static final long MB = 1048576;
	private static final long KB = 1024;
	private static final long B = 1;

	public static void main(String[] args) {

		SizeConverter s = new SizeConverter();

		System.out.println("1 Tb".equals(s.convertToHumanReadable(TB)) ? "Ok" : "Fail"); // 1 Tb
		System.out.println("1 Tb".equals(s.convertToHumanReadable(TB + 1)) ? "Ok" : "Fail"); // 1 Tb
		System.out.println("1023.9 Gb".equals(s.convertToHumanReadable(TB - 1)) ? "Ok" : "Fail"); // 1023.9 Gb
		System.out.println("1.4 Tb".equals(s.convertToHumanReadable(1_5_99511627776L)) ? "Ok" : "Fail"); // 1.4 Tb

		System.out.println("1 Gb".equals(s.convertToHumanReadable(GB)) ? "Ok" : "Fail"); // 1 Gb
		System.out.println("1.7 Gb".equals(s.convertToHumanReadable(1879048192L)) ? "Ok" : "Fail"); // 1.7 Gb

		System.out.println("1 Mb".equals(s.convertToHumanReadable(MB)) ? "Ok" : "Fail"); // 1 Mb
		System.out.println("1.7 Mb".equals(s.convertToHumanReadable(MB + (long) (0.75 * MB))) ? "Ok" : "Fail"); // 1.7
																												// Mb

		System.out.println("1 Kb".equals(s.convertToHumanReadable(KB)) ? "Ok" : "Fail"); // 1 Kb
		System.out.println("1014 Kb".equals(s.convertToHumanReadable(MB - 10 * KB)) ? "Ok" : "Fail"); // 1014 Kb
		System.out.println("1 Kb".equals(s.convertToHumanReadable(KB + (long) (0.99 * KB))) ? "Ok" : "Fail"); // 1 Kb
																												// (1.9
																												// Kb)

		System.out.println("1 b".equals(s.convertToHumanReadable(B)) ? "Ok" : "Fail"); // 1 b
		System.out.println("600 b".equals(s.convertToHumanReadable(600)) ? "Ok" : "Fail"); // 600 b
		System.out.println("1023 b".equals(s.convertToHumanReadable(KB - 1)) ? "Ok" : "Fail"); // 1023 b

	}


}
