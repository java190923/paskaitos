package com.vcs.lects.l03.enums;

import com.vcs.lects.l03.integers.Mod;

public class App {
	
	

	 static final double PI = 3.14;
	

	public static void main(String[] args) {
		SavDiena susitikimas = SavDiena.Pirmadienis;
		System.out.println(susitikimas);
		susitikimas = SavDiena.Antradienis;
		System.out.println(susitikimas);
		
		
		System.out.println(Mod.metai);
		Mod.metai = 1999;
		
		Mod m = new Mod();
		System.out.println(m.metai);
		
		Mod m2 = new Mod();
		m2.metai = m2.metai + 1;
		System.out.println(m2.metai);
		
		

	}

}
