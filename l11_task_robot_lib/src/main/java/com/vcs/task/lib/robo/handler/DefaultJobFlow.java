package com.vcs.task.lib.robo.handler;

import com.vcs.task.lib.robo.steps.RoboStep;

public class DefaultJobFlow implements RoboEventsHandler {

	@Override
	public void doTheJobFlow(RoboStep step) {
		step.goForvard(2);
		step.right(1);
		step.goForvard(2);
		step.left(1);
		step.goForvard(3);
		step.left(2);
		step.analize();
	}

}
