package com.vcs.lects.l05.tasks;

public class Output {

    public void toConsole(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void toConsole(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void toConsole(Point[] point) {
        for (Point p : point) {
            System.out.println("x=" + p.x + " y=" + p.y);
        }
    }

    class Point {
        private int x;
        private int y;
    }

}
