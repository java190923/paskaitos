package com.vcs.lects.l18.cleancode.tasks.martin;

import java.io.File;
import java.io.IOException;


/**
 * @author mselv
 */

public class App {

    public static void main(String[] args) throws IOException {

        File x = new File("aaa.txt");
        FileAverageCalculator fac = new FileAverageCalculator(x);
        fac.createAndFillFileWithRandomsIfNotExists().calculateAverage();
        System.out.println(fac.getAverage());

    }

}