package com.vcs.lects.l05.tasks;

public class KaroliukaiDainiusImpl implements Karoliukai{


    public char[][] rotateClockwise(char[][] data, char emptyChar, int rotateCount) {
        int count = 1;
        do {
            data = rotate(pushToEnd(data, emptyChar));
            count++;
        } while (count <= rotateCount);
        return data;
    }

    public char[][] pushToEnd(char[][] data, char emptyChar) {
        for (int i = 0; i < data.length; i++) {
            boolean isEmpty = true;
            int countEmptySeq = 0;
            char[] tempChars = new char[data[0].length];
            for (int b = data[0].length - 1; b >= 0; b--) {
                tempChars[b] = data[i][b];
                if (emptyChar == data[i][b] && isEmpty) {
                    countEmptySeq++;
                } else {
                    isEmpty = false;
                }
            }
            for (int b = 0; b < tempChars.length; b++) {
                if (b < data[0].length - countEmptySeq) {
                    data[i][b + countEmptySeq] = tempChars[b];
                    // System.out.print(i + "" + (b + countEmptySeq) + " -" + tempChars[b] + ",");
                } else {
                    data[i][(tempChars.length - 1 - b)] = tempChars[b];
                    // System.out.print(i + "" + (tempChars.length - 1 - b) + " -" + tempChars[b] +",");
                }
            }
            // System.out.println();
        }
        return data;
    }

    public char[][] rotate(char[][] data) {
        char[][] a = new char[data[0].length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int b = 0; b < data[0].length; b++) {
                a[b][a[b].length - 1 - i] = data[i][b];
            }
        }
        return a;
    }

}
