package com.vcs.lects.l10.concurency;

import java.util.List;

public class PM extends Thread {

	private Jira jira;
	private int kiekUztrunka = 0;
	private List<Dev> devsTeam;

	public PM(Jira jira, int kiekUztrunka, List<Dev> devsTeam) {
		this.jira = jira;
		this.kiekUztrunka = kiekUztrunka;
		this.devsTeam = devsTeam;
	}

	public void teikiaAtaskaitasMums() {

		try {
			Thread.sleep(kiekUztrunka);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int tasksAll = jira.kiekDarbuLike();
		int tasksNew = jira.kiekDarbuNepradetuLike();
		int dirbantys = 0;
		int gyvi = 0;

		for (Dev dev : devsTeam) {
			gyvi += dev.isAlive() ? 1 : 0;
			dirbantys += dev.isDirba() && dev.isAlive() ? 1 : 0;
		}

		boolean futboliukas = dirbantys < gyvi;

		System.out.println("Tasks: " + tasksNew +" ("+ tasksAll + ") dirba: " + dirbantys + " / " + devsTeam.size() + " "
				+ (futboliukas ? "futboliukas!" : ""));

	}

	@Override
	public void run() {

		while (true) {
			teikiaAtaskaitasMums();
		}

	}

}
