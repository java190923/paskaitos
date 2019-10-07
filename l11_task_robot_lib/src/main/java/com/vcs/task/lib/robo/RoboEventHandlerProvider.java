package com.vcs.task.lib.robo;

import com.vcs.task.lib.robo.handler.RoboEventsHandler;

public interface RoboEventHandlerProvider {

	RoboEventsHandler provideHandler();

}
