/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.collections;

import com.vcs.lects.l09.tasks.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author owr
 */
public class ArrayListExamplesPerson {

    public static void main(String[] args) {

        List<Person> strs = new ArrayList<>();

        Person ref = new Person("Vardenis", "?");

//        ref.equals(ref)
        
        strs.add(ref);
        strs.add(new Person("Vardauskas", "!"));
        strs.add(new Person("Vardis", "@"));

        if (strs.contains(ref)) {
            System.out.println("TAIP");
        } else {
            System.out.println("NE");
        }

        for (Person str : strs) {
            System.out.println(str.getName());
        }

    }

}
