package com.vcs.lects.l10.concurency;

public class QA extends Thread {
	private Jira jira = null;
	private int uztrunka = 0;

	public QA(Jira jira, int uztrunka) {
		this.jira = jira;
		this.uztrunka = uztrunka;
	}

	public void ieskoDefekteliu() {

		try {
			Thread.sleep(uztrunka);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jira.uzregistruotiDefekta();

	}

	@Override
	public void run() {

		while (true) {
			ieskoDefekteliu();
		}

	}
}
