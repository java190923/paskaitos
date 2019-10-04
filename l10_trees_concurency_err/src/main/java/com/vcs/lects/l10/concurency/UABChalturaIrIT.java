package com.vcs.lects.l10.concurency;

import java.util.ArrayList;
import java.util.List;

public class UABChalturaIrIT {

	private static final int DELAY = 1000;

	public static void main(String[] args) {

		Jira jira = new Jira();

		List<QA> qaTeam = new ArrayList<>();
		qaTeam.add(new QA(jira, 5 * DELAY));
		qaTeam.add(new QA(jira, 5 * DELAY));
		//qaTeam.add(new QA(jira, 1 * DELAY));
		//qaTeam.add(new QA(jira, 2 * DELAY));
		//qaTeam.add(new QA(jira, 3 * DELAY));
		//qaTeam.add(new QA(jira, 3 * DELAY));
		qaTeam.add(new QA(jira, 5 * DELAY));

		for (QA qa : qaTeam) {
			qa.start();
		}

		List<Dev> devTeam = new ArrayList<>();

		devTeam.add(new Dev(jira, 1 * DELAY));
		devTeam.add(new Dev(jira, 1 * DELAY));
		devTeam.add(new Dev(jira, 1 * DELAY));
		devTeam.add(new Dev(jira, 1 * DELAY));
		devTeam.add(new Dev(jira, 2 * DELAY));
		// devTeam.add(new Dev(jira, 3 * DELAY));

		for (Dev dev : devTeam) {
			dev.start();
		}

		PM pm = new PM(jira, 1000, devTeam);
		pm.start();

		System.out.println("UAB pradejo dirbti...");

	}

}
