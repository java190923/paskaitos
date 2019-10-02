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
public abstract class TrPriemone {

    public void move() {
        System.out.println("Moving : " + getSpeed() + " km/h");
    }

    public abstract int getSpeed();

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + getSpeed() + '}';
    }

}
