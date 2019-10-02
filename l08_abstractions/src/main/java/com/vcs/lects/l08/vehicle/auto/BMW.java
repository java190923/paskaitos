/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l08.vehicle;

/**
 *
 * @author owr
 */
public class BMW extends Automobilis {

    public BMW(AutoColor color, String engine) {
        super();
        setColor(color);
        setEngine(engine);

    }

    @Override
    public int getSpeed() {
        return 140;
    }

}
