package com.vcs.lects.l04.tasks;

public class SavDienos {
	
	
	public static void main(String[] args) {
		SavDienos s = new SavDienos();
		String dayStr = s.weekDayToStrTypeSwitch(6);
	
		System.out.println(dayStr);
	}
	
	public String weekDayToStr(int i) {
		
		if (i == 1) return "pirm";
		if (i == 2) return "antr";
		if (i == 3) return "trec";
		if (i == 4) return "ketv";
		if (i == 5) return "penk";
		if (i == 6) return "sest";
		if (i == 7) return "sekm";
		
		return "???";
	}
	
	public String weekDayToStrType(int i) {
		
		if (i >= 1 && i <= 5) return "sunkoka...";
		if (i >= 6 && i <= 7) return "va cia geriau...";
		
		return "???";
	}
	
	public String weekDayToStrTypeSwitch(int i) {
		
		switch (i) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5: return "sunkoka...";
			
		case 6:
		case 7: return "va cia geriau...";

		default: return "???";

		}
	}
	
	// Ne visi case'ai!
	public String weekDayToStrTypeShort(int i) {
		return (i >= 1 && i <= 5 ? "sunkoka..." : "va cia geriau...");
	}

}
