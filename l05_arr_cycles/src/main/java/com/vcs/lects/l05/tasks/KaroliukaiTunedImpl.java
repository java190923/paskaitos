package com.vcs.lects.l05.tasks;

public class KaroliukaiTunedImpl implements Karoliukai {

    private char[][] dataH;
    private char[][] dataV;

    public char[][] rotateClockwise(char[][] data, char emptyChar, int rotateCount) {

        dataH = data;
        dataV = new char[data[0].length][data.length];

        char[][] d1 = dataH;
        char[][] d2 = dataV;

        for (int i = 0; i < rotateCount; i++) {

            if (i % 2 == 0) {
                d1 = dataH;
                d2 = dataV;
            } else {
                d1 = dataV;
                d2 = dataH;
            }

            doGravity(d1, emptyChar);
            rotateOneTime(d1, d2);
        }

        return d2;
    }

    private void rotateOneTime(char[][] dataForGravity, char[][] dataForAfterRotate) {

        for (int i = 0; i < dataForGravity.length; i++) {
            for (int j = 0; j < dataForGravity[0].length; j++) {
                dataForAfterRotate[j][dataForGravity.length - i - 1] = dataForGravity[i][j];
            }
        }
    }

    private void doGravity(char[][] data, char emptyChar) {

        int gapToFall = 0;

        for (int row = 0; row < data.length; row++) {

            gapToFall = howFarItShouldFall(data, row, emptyChar);

            if (gapToFall > 0) {
                letItFall(data, row, gapToFall, emptyChar);
            }

        }

    }

    private int howFarItShouldFall(char[][] data, int row, char emptyChar) {

        char[] rowArr = data[row];
        int gapToFall = 0;
        for (int i = rowArr.length - 1; i > 0; i--) {

            if (rowArr[i] == emptyChar) {
                gapToFall++;
            } else {
                break;
            }
        }
        return gapToFall;
    }

    private void letItFall(char[][] data, int row, int gapToFall, char emptyChar) {

        char[] rowArr = data[row];

        // Lets moving

        for (int i = rowArr.length - 1; i >= gapToFall; i--) {
            rowArr[i] = rowArr[i - gapToFall];
        }

        // Clean the beginning
        for (int i = 0; i < gapToFall; i++) {
            rowArr[i] = emptyChar;
        }

    }

}
