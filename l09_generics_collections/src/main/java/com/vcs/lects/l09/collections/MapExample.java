/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.collections;

import com.vcs.lects.l09.tasks.Person;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author owr
 */
public class MapExample {

    public static void main(String[] args) {

        Map<Person, List<Map<String, Integer>>> ilgiai = new HashMap<>();

    }

    public void map() {

        Map<String, Integer> ilgiai = new HashMap<>();

        addToMap(ilgiai, "adsljasldjsalkdjlsakjd");
        addToMap(ilgiai, "ertert");
        addToMap(ilgiai, "gfjfjhfjfjgfjfgfhfgh");

        Integer i = ilgiai.get("asdad"); // null

    }

    public void addToMap(Map<String, Integer> m, String str) {

        m.put(str, str.length());

    }

}
