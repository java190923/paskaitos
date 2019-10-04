/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.tasks;

/**
 *
 * @author owr
 */
public class CustomImplementaionTask {

    private ToStringConverter vardConv = (obj) -> ((Person) obj).getSurname();

    public static void main(String[] args) {

        String[] strs = {"100", "10", "1", "099"};

// Ir didejancia ir mazejancia tvarka rikuoti
        Double[] dbls = {3.14, 60.0, 1.46};

// Rodyt turi varda, bet rikuoti pagal eil nr.
        Person[] prsns = {
            new Person("Ona", ""),
            new Person("Jonas", ""),
            new Person("Vardene", ""),};
        
        
       

        String result = ToStrUtil.toStr(", ", ((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())), ((o) -> o.getName()), new Person("Petras", "Petrauskas"), new Person("Petras4", "Petrauskas4"), new Person("Petras1", "Petrauskas1"));
        System.out.println();
        System.out.println(result);
        System.out.println();

        result = ToStrUtil.toStr(4, 7, 1, 2, 9);
        System.out.println();
        System.out.println(result);
        System.out.println();

        result = ToStrUtil.toStr(" ", ((o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1)), ((o) -> o.toString()), strs);
        System.out.println();
        System.out.println(result);
        System.out.println();

        result = ToStrUtil.toStr(prsns);
        System.out.println();
        System.out.println(result);
        System.out.println();
    }

}
