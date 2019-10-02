package com.vcs.lects.l04.tasks;

public class Tiltai {

	public boolean getWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
		boolean way1 = p1 && p2;
		boolean way2 = p4 && p5;
		boolean way3 = p1 && p3 && p5;
		boolean way4 = p4 && p3 && p2;
		boolean way5 = p4 && p6 && p2;

		return way1 || way2 || way3 || way4 || way5;
	}
        
        public boolean getWay2(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {

		boolean closeIn = !p1 && !p4;
		boolean closeOut = !p2 && !p5;
		boolean isClosed = closeIn || closeOut;

		return !isClosed;

	}

	public String getShortestWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {

		if (p1 && p2) return "p1 p2";
		if (p4 && p5) return "p4 p5";
		if (p1 && p3 && p5) return "p1 p3 p5";
		if (p4 && p3 && p2) return "p4 p3 p2";
		if (p4 && p6 && p2) return "p4 p6 p2";

		return "???";
	}

}
