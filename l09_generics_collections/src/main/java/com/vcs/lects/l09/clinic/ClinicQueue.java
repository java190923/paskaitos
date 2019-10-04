/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.clinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author owr
 */
public class ClinicQueue {

    public static void main(String[] args) {

        List<Patient> queue = new ArrayList<>();

        queue.add(new Patient(22, "Siaudvytis"));
        queue.add(new Patient(30, "Petrauskas"));
        queue.add(new Patient(99, "Jonautis"));
        queue.add(new Patient(40, "Žvinys"));
        queue.add(new Patient(40, "žilinskiene"));
        queue.add(new Patient(41, "Žukauskas"));
        queue.add(new Patient(30, "Petravicius"));
        queue.add(new Patient(30, "Pavardauskas"));

        Collections.sort(queue);

        for (Patient patient : queue) {
            System.out.println(patient);
        }

        System.out.println("-------------------------");

        Comparator<Patient> jaunimasFirst = new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o2.getAge() - o1.getAge() != 0) {
                    return o1.getAge() - o2.getAge();
                }
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };

        Collections.sort(queue, jaunimasFirst);

        for (Patient patient : queue) {
            System.out.println(patient);
        }

    }

}
