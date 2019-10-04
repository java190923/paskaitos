package com.vcs.lects.l10.concurency;

import java.util.ArrayList;
import java.util.List;

public class Jira {

	private int number = 0;
	private List<String> tasks = new ArrayList<>();

	public void uzregistruotiDefekta() {

		synchronized (tasks) {
			tasks.add("#" + number++);
		}

	}

	public String pasiimtiTask() {

		synchronized (tasks) {
			for (String string : tasks) {
				if (!string.endsWith("-taken")) {
					int i = tasks.indexOf(string);
					tasks.set(i, string + "-taken");
					return tasks.get(i);
				}
			}
		}
		return null;

	}

	public void isprestiTask(String task) {

		synchronized (tasks) {
			int i = tasks.indexOf(task);

			if (i < 0) {
				System.err.println("Neradau task: " + task);
			} else {
				tasks.remove(i);
			}
		}
	}

	public int kiekDarbuLike() {
		return tasks.size();
	}

}
