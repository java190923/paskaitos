package com.vcs.lects.l14.files.res06_json;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GSonReader {

    public static void main(String[] args) throws IOException {


        File file = new File("abc.json");
        Reader reader = new FileReader(file);

        Gson gson = new Gson();

        ModelObject mo = gson.fromJson(reader, ModelObject.class);

        for (String pKey: mo.getPersons().keySet()) {

            System.out.println("KEY: " + pKey);
            System.out.println(mo.getPersons().get(pKey).getName());
            System.out.println(mo.getPersons().get(pKey).getAge());
            System.out.println();
        }


        for (String s: mo.getStringArr()) {
            System.out.println(s);
        }

    }


}
