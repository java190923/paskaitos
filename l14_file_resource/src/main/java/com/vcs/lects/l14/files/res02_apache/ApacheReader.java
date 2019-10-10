package com.vcs.lects.l14.files.res02_apache;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ApacheReader {


    public static void main(String[] args) throws IOException {

        File f = new File("duomenys.dat");

        java.util.List<String> lines = FileUtils.readLines(f, java.nio.charset.StandardCharsets.UTF_8);

        int c = 0;
        for (String line : lines) {
            System.out.println("" + ++c + " : " + line);
        }

    }


}
