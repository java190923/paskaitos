package com.vcs.lects.l05.tasks;

public class KaroliukaiMartynasImpl  implements Karoliukai {

    public char[][] rotateClockwise(char[][] data, char empty, int rotateCount) {
        for (int i = 0; i < rotateCount; i++) {
            data = sink(data, empty);
            data = rotate(data);
        }
        return data;
    }

    public char[][] rotate(char[][] dezute) {
        char[][] newBox = new char[dezute[0].length][dezute.length];
        for (int i = 0; i < dezute[0].length; ++i) {
            for (int j = 0; j < dezute.length; ++j) {
                newBox[i][j] = dezute[dezute.length - j - 1][i];
            }
        }
        return newBox;
    }

    public char[][] sink(char[][] dezute, char empty) {
        for (int i = 0; i < dezute.length; i++) {
            if (dezute[i][dezute[i].length - 1] == empty) {
                boolean found = false;
                int pos = dezute[i].length - 1;
                for (int j = dezute[i].length - 1; j >= 0; j--) {
                    if (found) {
                        //found
                        dezute[i][pos] = dezute[i][j];
                        dezute[i][j] = empty;
                        pos--;
                    } else {
                        //not found
                        if (dezute[i][j] != empty) {
                            found = true;
                            dezute[i][pos] = dezute[i][j];
                            dezute[i][j] = empty;
                            pos--;
                        }
                    }
                }
            }
        }
        return dezute;
    }

}
