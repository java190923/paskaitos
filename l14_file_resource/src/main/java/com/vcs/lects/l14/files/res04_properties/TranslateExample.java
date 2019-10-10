package com.vcs.lects.l14.files.res04_properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

public class TranslateExample {

    private Map<String, Properties> monthTr = new HashMap<>();

    public static void main(String[] args) throws IOException {

        TranslateExample tr = new TranslateExample();
        tr.example();

    }


    public void example() throws IOException {

        File f = new File("month_en_lt.properties");

        Reader reader = new FileReader(f);
        Properties prop = new Properties();
        prop.load(reader);

        monthTr.put("lt", prop);

        f = new File("month_en_US.properties");
        reader = new FileReader(f);
        prop = new Properties();
        prop.load(reader);

        monthTr.put("en", prop);


        f = new File("config.properties");

        reader = new FileReader(f);
        prop = new Properties();
        prop.load(reader);


        Optional<Object> lang = Optional.ofNullable(prop.get("lang"));
        for (int i = 1; i <= 12; i++) {
            System.out.println(resolveMonth(i, lang.orElse("en").toString()));
        }

    }


    private String resolveMonth(int month, String lang) throws IOException {
        return monthTr.get(lang).getOrDefault("m_" + month, "???").toString();
    }

}
