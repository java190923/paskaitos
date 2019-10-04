/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author owr
 */
public class ArrayListExamples {

    public static void main(String[] args) {

        List<String> strs = new ArrayList<>();

        strs.add("Pirmas");
        strs.add("Antras");
        strs.add("TRecias");

        List<String> papildomas = new ArrayList<>();

        papildomas.add("1");
        papildomas.add("0");
        papildomas.add("1");
        papildomas.add("2");

        strs.addAll(papildomas);

        strs.add(2, "AAAA"); // iterpia

        // strs.set(3, "BBB"); // ant virsaus
        strs.remove("1");

        strs.removeAll(papildomas);

        String firstOlways = strs.get(0);

        int index = strs.indexOf("Antras"); //1

        strs.clear();
        strs.add("Pirmas");
        strs.add("Pirmas");
        strs.add("Antras");
        strs.add("TRecias");

        int size = strs.size(); // 3

        if (!strs.isEmpty()) {
            System.out.println("Cia kazkas yra! :D");
        }

        if (strs.get(1) != null) {
            // ar antras elementas yra tuscias
        }

        if (strs.contains("Pirmas")) {
            System.out.println("TAIP");
        } else {
            System.out.println("NE");
        }

        /**
         * Collections
         */
        Collections.shuffle(strs);
        Collections.replaceAll(strs, "Pirmas", "1");

        for (String str : strs) {
            System.out.println(str);
        }

    }

}
