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
public class PaspirtukasEV extends TrPriemone {

    private int batteryCapacity;

    public PaspirtukasEV() {
        this.batteryCapacity = 100;
        // setSpeed(251);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "PaspirtukasEV{" + "batteryCapacity=" + batteryCapacity + '}' + super.toString();
    }

    @Override
    public int getSpeed() {
        return 25;
    }
    
     @Override
    public void move() {
        System.out.println("Judu kiek galiu : " + getSpeed() + " km/h");
    }

}
