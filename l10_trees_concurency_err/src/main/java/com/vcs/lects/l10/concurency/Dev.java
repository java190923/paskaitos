package com.vcs.lects.l10.concurency;

public class Dev extends Thread {

	private Jira jira = null;
	private int uztrunka = 0;
	private String task = null;

	public Dev(Jira jira, int uztrunka) {
		this.jira = jira;
		this.uztrunka = uztrunka;
	}

	public boolean isDirba() {
		return task != null;
	}

	public void kodina() {
		task = jira.pasiimtiTask();
		if (null != task) {

			try {
				Thread.sleep(uztrunka);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			jira.isprestiTask(task);

		}
	}

	@Override
	public void run() {

		while (true) {
			kodina();
		}

	}

}
