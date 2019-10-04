package com.vcs.lects.l10.concurency;

public class Dev extends Thread {

	private Jira jira = null;
	private int uztrunka = 0;
	private boolean dirba = false;

	public Dev(Jira jira, int uztrunka) {
		this.jira = jira;
		this.uztrunka = uztrunka;
	}

	public boolean isDirba() {
		return dirba;
	}

	public void kodina() {
		dirba = true;

		String task = jira.pasiimtiTask();
		if (task != null) {

			try {
				Thread.sleep(uztrunka);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			jira.isprestiTask(task);
		} else {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		dirba = false;

	}

	@Override
	public void run() {

		while (true) {
			kodina();
		}

	}

}
