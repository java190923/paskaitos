package com.vcs.lects.l14.files.res02_apache;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;

public class ApacheWriter {

    public static void main(String[] args) {

        File f = new File("duomenys.dat");

        java.util.List<String> lines = new ArrayList<>();

        int c = 0;
        String line = "";
        while (line.length() < 100) {
            line += "bilekas" + c++;
            lines.add(line);
        }

        try {
            FileUtils.writeLines(f, "UTF-8", lines, true);
        } catch (IOException | UnsupportedCharsetException e) {
            throw new RuntimeException(e);
        }


    }

}
