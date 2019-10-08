package com.vcs.lects.l05.tasks;

public class KaroliukaiImpl  implements Karoliukai {

	public char[][] rotateClockwise(char[][] data, char emptyChar, int rotateCount) {

		for (int i = 0; i < rotateCount; i++) {

			data = doGravity(data, emptyChar);
			data = roteOneTime(data);

		}
		return data;
	}

	private char[][] roteOneTime(char[][] data) {

		char[][] rotated = new char[data[0].length][data.length];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				rotated[j][ data.length - i - 1] = data[i][j];
			}
		}
		return rotated;
	}

	private char[][] doGravity(char[][] data, char emptyChar) {
		int gapToFall = 0;

		for (int row = 0; row < data.length; row++) {

			gapToFall = howFarItShouldFall(data[row], emptyChar);

			if (gapToFall > 0) {
				letItFall(data[row], gapToFall, emptyChar);
			}
		}

		return data;
	}

	private void letItFall(char[] rowData, int gapToFall, char emptyChar) {

		// Perstumiam
		for (int i = rowData.length - 1; i >= gapToFall; i--) {
			rowData[i] = rowData[ i - gapToFall ];
		}

		// Prieki isvalom
		for (int i = 0; i < gapToFall; i++) {
			rowData[i] = emptyChar;
		}
	}

	private int howFarItShouldFall(char[] rowData, char emptyChar) {

		int gapToFall = 0;
		for (int i = rowData.length - 1; i > 0; i--) {

			if (rowData[i] == emptyChar) {
				gapToFall++;
			} else {
				break;
			}

		}

		return  gapToFall;

	}



}
