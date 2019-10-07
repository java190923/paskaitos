package com.vcs.task.lib.robo.handler;

import com.vcs.task.lib.robo.steps.Step;

public interface EventsListener {

	void doAction(Step step, int count);

	void done(int x, int y, int pos);

}
