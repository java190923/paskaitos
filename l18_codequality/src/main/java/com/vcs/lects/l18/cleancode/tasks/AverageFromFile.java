package com.vcs.lects.l18.cleancode.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.Collectors.toList;

public class AverageFromFile {


    public static void main(String[] args) throws IOException {
        System.out.println(new AverageFromFile().averageFromFile("data.txt"));
    }

    public double averageFromFile(String fileName) throws IOException {

        Path path = Paths.get(fileName);

        List<String> lines;
        List<Integer> data;

        if (Files.exists(path)) {
            lines = Files.lines(path).collect(toList());
            data = lines.stream().map(Integer::parseInt).collect(toList());
        } else {
            data = randomData();
            lines = data.stream().map(String::valueOf).collect(toList());
            Files.createFile(path);
            Files.write(path, lines);
        }

        return data.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    private List<Integer> randomData() {
        return IntStream.generate(() -> current().nextInt(Integer.MAX_VALUE)).limit(current().nextInt(50000)).boxed().collect(toList());
    }


}
