/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.clinic;

import javax.swing.ComboBoxEditor;

/**
 *
 * @author owr
 */
public class Patient implements Comparable<Patient> {

    private int age;
    private String name;

    public Patient(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" + "age=" + age + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Patient o) {
        // -1 : esamas objektas yra pirmesnis
        // 0 : abu vienodi
        // 1 : esamas objektas yra paskesnis

        if (o.age - age != 0) {
            return o.age - age;
        }

        return name.compareToIgnoreCase(o.name);

    }

}
