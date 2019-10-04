/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.tasks;

import com.vcs.lects.l09.vehicle.Street;

/**
 *
 * @author owr
 */
public class AvoidObject {

    public <T> String toStr(String sep, T... objs) {

        //Arrays.sort(objs);
        String result = "";
        for (T obj : objs) {
            result += obj.toString() + sep;
        }

        return result;
    }

    public static void main(String[] args) {

        AvoidObject ao = new AvoidObject();
        String result = ao.toStr(", ", 2, 5, 8);

    }

}
