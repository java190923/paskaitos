package com.vcs.lects.l14.files.res06_json;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class GSonWriter {

    public static void main(String[] args) throws  IOException{

        ModelObject mo = new ModelObject();


        Gson gson = new Gson();
        String objStrContent = gson.toJson(mo);
        File file = new File("abc.json");
        FileUtils.write(file, objStrContent, StandardCharsets.UTF_8, false);

        System.out.println("Done");

    }

}
