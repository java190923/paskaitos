package com.vcs.lects.l18.cleancode.tasks;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageFromFileImperative {

    private static final int MAX_VALUES_IN_FILE = 50000;

    public static void main(String[] args) throws IOException {

        AverageFromFileImperative c = new AverageFromFileImperative();
        double avg = c.calc("data.txt");

        System.out.println(avg);
    }

    private double calc(String path) throws IOException {
        File file = new File(path);

        List<Integer> data = null;
        if (!file.exists()) {
            data = createRandomData();
            createFile(file, data);
        } else {
            data = readFromFile(file);
        }
        return avgCalc(data);
    }

    private List<Integer> readFromFile(File file) throws IOException {
        List<String> lines = FileUtils.readLines(file, java.nio.charset.StandardCharsets.UTF_8);
        List<Integer> result = new ArrayList<>();
        for (String str : lines) {
            result.add(Integer.parseInt(str));
        }
        return result;
    }

    private void createFile(File file, List<Integer> data) throws IOException {
        FileUtils.writeLines(file, "UTF-8", data, true);
    }

    private double avgCalc(List<Integer> data) {

        double avg = 0;
        for (Integer sk : data) {
            avg += (1.0 * sk) / data.size();
        }

        return avg;
    }

    private List<Integer> createRandomData() {
        List<Integer> result = new ArrayList<>();
        Random rnd = new Random();
        int maxVals = rnd.nextInt(MAX_VALUES_IN_FILE);
        for (int i = 0; i < maxVals; i++) {
            result.add(rnd.nextInt(Integer.MAX_VALUE));
        }
        return result;
    }
}
