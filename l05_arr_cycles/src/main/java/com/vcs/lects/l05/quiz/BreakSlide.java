package com.vcs.lects.l05.quiz;

public class BreakSlide {

	public int linesBelowWaterLevel(int[][] map) {
		int count = 0;

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] < 0) {
					count++;
					break;
				}
			}
		}

		return count;
	}

}
