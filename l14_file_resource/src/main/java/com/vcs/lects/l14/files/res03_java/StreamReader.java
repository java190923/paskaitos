package com.vcs.lects.l14.files.res03_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class StreamReader {


    public static void main(String[] args) throws IOException {


        String fileName = "duomenys.dat";

        java.util.List<String> lines = Files.lines(Paths.get(fileName)).collect(Collectors.toList());

        int c = 0;
        for (String line : lines) {
            System.out.println("" + ++c + " : " + line);
        }

    }
}
