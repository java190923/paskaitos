package com.vcs.lects.l18.cleancode.tasks.martin;

import java.io.*;
import java.util.Random;

public class FileAverageCalculator {


    private File file;
    private Long average;

    FileAverageCalculator(File file) throws IOException {
        this.file = file;
    }


    public Long getAverage() {
        return average;
    }

    public FileAverageCalculator createAndFillFileWithRandomsIfNotExists() throws IOException {

        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("Sukure: " + file.getAbsolutePath());
                fillFileWithRandoms();
            } else {
                System.out.println("Egzistuoja: " + file.getAbsolutePath());
            }
        }
        return this;
    }

    private FileAverageCalculator fillFileWithRandoms() throws IOException {

        FileWriter fw = new FileWriter(file, true);
        Random roma = new Random();
        int x = roma.nextInt(200);
        int y = roma.nextInt(250);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                fw.write(String.valueOf(roma.nextInt(Integer.MAX_VALUE)));
                fw.write("\n");
            }
        }
        return this;

    }

    public FileAverageCalculator calculateAverage() throws IOException {

        BufferedReader buffReader = new BufferedReader(new FileReader(file));
        String line = buffReader.readLine();

        Long sum = 0L;
        Long count = 0L;

        System.out.println("Failo turinys:");

        while (null != line && !line.isEmpty()) {

            //avg += Integer.getInteger(line);
            sum += Long.valueOf(line);
            System.out.println("" + ++count + " ) " + line);
            line = buffReader.readLine();
        }

        average = sum / count;
        return this;

    }

}
