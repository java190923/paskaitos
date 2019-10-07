package com.vcs.task.lib.robo.handler;

import com.vcs.task.lib.robo.RoboEventHandlerProvider;

public class EventsHandlerFactory {

	private static RoboEventsHandler h = null;

	public static RoboEventsHandler makeInstance(RoboEventHandlerProvider... providers) {

		if (h == null) {
			for (RoboEventHandlerProvider roboEventHandlerProvider : providers) {
				if (roboEventHandlerProvider != null) {
					h = roboEventHandlerProvider.provideHandler();
					break;
				}
			}
		}
		return h;
	}

}
