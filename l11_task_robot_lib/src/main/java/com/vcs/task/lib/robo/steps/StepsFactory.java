package com.vcs.task.lib.robo.steps;

import com.vcs.task.lib.robo.handler.EventsListener;

public class StepsFactory {

	public static RoboStep makeInstance(EventsListener listener) {

		if (listener == null) {
			listener = new EventsListener() {

				@Override
				public void done(int x, int y, int pos) {
					System.out.println("x,y = [" + x + "," + y + "] " + pos);

				}

				@Override
				public void doAction(Step step, int count) {
					System.out.println(step + " " + count);

				}
			};
		}

		RoboStep rstep = new RoboStep() {
			private EventsListener l = null;

			private int x;
			private int y;
			private int pos = 0;

			@Override
			public void right(int count) {
				pos -= 90 * count;
				l.doAction(Step.RIGHT, count);
			}

			@Override
			public void left(int count) {
				pos += 90 * count;
				l.doAction(Step.LEFT, count);
			}

			@Override
			public void goForvard(int count) {

				pos %= 360;
				if (pos < 0) {
					pos += 360;
				}
				switch (pos) {
				case 0:
				case 360:
					x += count;
					break;
				case 90:
					y += count;
					break;
				case 180:
					x -= count;
					break;
				case 270:
					y -= count;
					break;

				}
				l.doAction(Step.FORVARD, count);
			}

			@Override
			public void analize() {
				l.done(x, y, pos);
			}

			@Override
			public void addListener(EventsListener listener) {
				l = listener;
			}

			@Override
			public void setStartingPoint(int x, int y) {
				this.x = x;
				this.y = y;
			}
		};

		rstep.setStartingPoint(0, 0);
		rstep.addListener(listener);

		return rstep;
	}

}
