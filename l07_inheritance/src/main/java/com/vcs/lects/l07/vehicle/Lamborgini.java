/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l07.vehicle;

/**
 *
 * @author owr
 */
public class Lamborgini extends Automobilis {

    public Lamborgini() {
        setColor(AutoColor.WHITE);
        setEngine("V12");
        setSpeed(325);
    }

    public Lamborgini(AutoColor color) {
        setColor(color);
        setEngine("V12");
        setSpeed(320);
    }

}
