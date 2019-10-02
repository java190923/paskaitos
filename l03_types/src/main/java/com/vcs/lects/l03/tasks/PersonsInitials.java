/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l03.tasks;

/**
 *
 * @author owr
 */
public class PersonsInitials {

    public Person personFromString(String strData) {
        String[] strAtributai = strData.split(" ");

        int i = 0;
        Person rezultatas = new Person();

        if (strAtributai.length == 6) {
            rezultatas.setName(strAtributai[i++] + " " + strAtributai[i++]);
        } else if (strAtributai.length == 5) {
            rezultatas.setName(strAtributai[i++]);
        }
        rezultatas.setSurname(strAtributai[i++]);
        rezultatas.setAk(strAtributai[i++]);
        rezultatas.setbYear(Integer.parseInt(strAtributai[i++]));
        rezultatas.setGender(Gender.valueOf(strAtributai[i++].toUpperCase()));

        return rezultatas;
    }

}
