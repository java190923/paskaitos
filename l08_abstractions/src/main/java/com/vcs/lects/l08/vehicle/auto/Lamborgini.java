/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l08.vehicle.auto;

import com.vcs.lects.l08.vehicle.varikliai.V12;
import com.vcs.lects.l08.vehicle.KritDaviklis;
import com.vcs.lects.l08.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public class Lamborgini extends Automobilis implements KritDaviklis {

    private boolean special = false;

    // Special edition
    public Lamborgini() {
        setColor(AutoColor.WHITE);
//        setEngine("V12");
        special = true;
        //setSpeed(325);
    }

    // Daily edition
    public Lamborgini(AutoColor color) {
        setColor(color);
//        setEngine("V12");
        //setSpeed(320);
    }

    @Override
    public int getSpeed() {

        if (special) {
            return 325;
        }
        return 320;
    }

    @Override
    public void move() {
        System.out.println("Lipdo i sedyne : " + getSpeed() + " km/h");
    }

    @Override
    public Variklis getVariklis() {
        return new V12();
    }

}
