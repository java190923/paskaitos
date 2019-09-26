package com.vcs.lects.l04.tasks;

import com.vcs.lects.l04.tasks.Tiltai;

public class TiltaiTest {

	public static void main(String[] args) {

		Tiltai s = new Tiltai();
		
		System.out.println(!s.getWay(false, true, true, false, true, true) ? "Ok" : "Fail");
		System.out.println(!s.getWay(true, false, true, true, false, true) ? "Ok" : "Fail");
		System.out.println(s.getWay(true, true, true, true, true, true) ? "Ok" : "Fail");
		
		System.out.println(s.getWay(true, true, false, false, false, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(false, false, false, true, true, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(true, false, true, false, true, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(false, true, true, true, false, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(false, true, false, true, false, true) ? "Ok" : "Fail");
		
		
	}
	
	
}
