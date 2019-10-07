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
		v.init();
		v.runRobo(null);

	}
}
