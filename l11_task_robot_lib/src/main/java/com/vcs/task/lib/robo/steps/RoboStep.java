package com.vcs.task.lib.robo.steps;

import com.vcs.task.lib.robo.handler.EventsListener;

public interface RoboStep {

	void addListener(EventsListener listener);

	void setStartingPoint(int x, int y);

	void goForvard(int count);

	void left(int count);

	void right(int count);

	void analize();

}
