package com.vcs.task.lib.robo;

import com.vcs.task.lib.robo.handler.DefaultJobFlow;
import com.vcs.task.lib.robo.handler.EventsHandlerFactory;
import com.vcs.task.lib.robo.handler.EventsListener;
import com.vcs.task.lib.robo.handler.RoboEventsHandler;
import com.vcs.task.lib.robo.steps.StepsFactory;

public final class RoboLib implements RoboEventHandlerProvider {

	private RoboEventsHandler eventHandler = null;
	private RoboEventHandlerProvider eventHandlerProvider = null;
	private boolean initStatus = false;

	public RoboLib() {
		initStatus = eventHandler == null;
	}

	public final void runRobo(EventsListener listener) {
		if (!initStatus) {
			throw new RuntimeException("Not initialized");
		}
		eventHandler.doTheJobFlow(StepsFactory.makeInstance(listener));
	}

	public final RoboEventHandlerProvider getRoboEventHandlerProvider() {
		return eventHandlerProvider;
	}

	public final void setRoboEventHandlerProvider(RoboEventHandlerProvider eventHandlerProvider) {
		this.eventHandlerProvider = eventHandlerProvider;
	}

	public final void init() {
		eventHandler = EventsHandlerFactory.makeInstance(eventHandlerProvider, this);
	}

	@Override
	public final RoboEventsHandler provideHandler() {
		return (eventHandler != null ? eventHandler : new DefaultJobFlow());
	}

}
