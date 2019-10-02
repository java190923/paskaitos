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
public class TrPriemone {

    private int speed = 0;

    public void move() {
        System.out.println("Moving : " + speed + " km/h");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + speed + '}';
    }
    
    

}
