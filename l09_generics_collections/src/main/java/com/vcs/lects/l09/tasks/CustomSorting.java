/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.tasks;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author owr
 */
public class CustomSorting {

    public static void main(String[] args) {

        String[] strs = {"100", "10", "1", "099"};

        Comparator<String> asInts = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        };

        Arrays.sort(strs, asInts);

        System.out.println(Arrays.toString(strs));

        /**
         *
         *
         */
        Double[] dbls = {3.14, 60.0, 1.46};
        Arrays.sort(dbls);
        System.out.println(Arrays.toString(dbls));

        //FIXME parasyti komparatoriu reversre orderingui
        /**
         *
         *
         *
         *
         */
//        Person rikiavimas 
    }

}
