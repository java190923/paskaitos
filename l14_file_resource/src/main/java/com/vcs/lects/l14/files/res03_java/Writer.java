package com.vcs.lects.l14.files.res03_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Writer {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("file.txt");

        List<String> lines = new ArrayList<>(Arrays.asList("Pirma eilute", "Antra eilute"));

        Files.createFile(path);
        Files.write(path, lines);

    }
}
