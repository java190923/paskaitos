package com.vcs.lects.l05.tasks;

public class AverageTask {

    public static void main(String[] args) {

        AverageTask avg = new AverageTask();

        System.out.println(Double.MAX_VALUE);
        double average = avg.calcAverage(Double.MAX_VALUE, Double.MAX_VALUE);

        System.out.println(average);

    }

    public double calcAverage(double... data) {

        double avg = 0;
        for (double d : data) {
            avg += d / data.length;
        }
        return avg;
    }

}
