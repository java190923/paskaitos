package com.vcs.task.lib.robo.app;

import com.vcs.task.lib.robo.RoboEventHandlerProvider;
import com.vcs.task.lib.robo.RoboLib;
import com.vcs.task.lib.robo.handler.EventsListener;
import com.vcs.task.lib.robo.handler.RoboEventsHandler;
import com.vcs.task.lib.robo.steps.RoboStep;
import com.vcs.task.lib.robo.steps.Step;

public class App {
	public static final void main(String[] dsf) {

		/**
		 * <p>
		 * Robotas pradeda eiti (FORWARD) nuo [0,0] tasko, ir sukinejasi po 90 laipsniu
		 * i abi puses (RIGHT, LEFT). Po parodytos sekos jo koordinates turetu buti
		 * kitokios [5,2].
		 * </p>
		 * 
		 * <li>1) Raskit kur yra klaida</li>
		 * <li>2) Nekeisdami kodo robot_lib modulyje pataisykit, kad veiktu taip kaip
		 * reikia</li>
		 * 
		 * <li>cd nusnaviguojat i /13_task_robot_lib</li>
		 * <li>mvn clean install</li>
		 * <li>Susiimportuojam 13_task_robot_app kaip mvn projekta</li>
		 * <li>Pasileidziat sita "App" klasyte</li>
		 * 
		 */

		RoboLib v = new RoboLib();
		v.setRoboEventHandlerProvider(new RoboEventHandlerProvider() {
			@Override
			public RoboEventsHandler provideHandler() {
				return new RoboEventsHandler() {
					@Override
					public void doTheJobFlow(RoboStep step) {
						step.goForvard(2);
						step.left(1);
						step.goForvard(2);
						step.right(1);
						step.goForvard(3);
						step.right(2);
						step.analize();
					}
				};
			}
		});
		v.init();
		v.runRobo(new EventsListener() {
			@Override
			public void doAction(Step step, int count) {

				if (Step.LEFT.equals(step)) {
					System.out.println(Step.RIGHT + " " + count);
					return;
				}

				if (Step.RIGHT.equals(step)) {
					System.out.println(Step.LEFT + " " + count);
					return;
				}

				System.out.println(step + " " + count);
			}

			@Override
			public void done(int x, int y, int pos) {
				System.out.println("x,y = [" + x + "," + y + "] " + pos);
			}
		});

	}
}
