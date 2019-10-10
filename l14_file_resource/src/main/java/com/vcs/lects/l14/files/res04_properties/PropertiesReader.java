package com.vcs.lects.l14.files.res04_properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesReader {

    public static void main(String[] args) throws IOException {

        PropertiesReader mr = new PropertiesReader();

        File f = new File("config.properties");

        Reader reader = new FileReader(f);
        Properties prop = new Properties();
        prop.load(reader);

        System.out.println("LANG: " + prop.get("lang"));

    }


}
