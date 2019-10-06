package com.vcs.lects.l10.concurency;

import java.util.ArrayList;
import java.util.List;

public class Jira {

	private int number = 0;
	private List<String> tasks = new ArrayList<>();
	private int tasksNew = 0;

	public void uzregistruotiDefekta() {

		synchronized (tasks) {
			tasksNew = countNew();
			tasks.add("#" + number++);
		}
	}

	public String pasiimtiTask() {

		synchronized (tasks) {

			for (int i = 0; i < tasks.size(); i++) {
				if (!tasks.get(i).endsWith("-taken")) {
					tasks.set(i, tasks.get(i) + "-taken");
					return tasks.get(i);
				}
			}

			return null;
		}

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

	public int kiekDarbuNepradetuLike() {
		return tasksNew;
	}

	private int countNew() {
		int c = 0;
		for (String taskNr : tasks) {
			if (!taskNr.endsWith("-taken")) {
				c++;
			}
		}
		return c;
	}

}
