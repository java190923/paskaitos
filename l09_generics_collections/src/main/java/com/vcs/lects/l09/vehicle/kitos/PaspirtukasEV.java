/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.vehicle.kitos;

import com.vcs.lects.l09.vehicle.TrPriemoneImpl;
import com.vcs.lects.l09.vehicle.varikliai.EV;
import com.vcs.lects.l09.vehicle.varikliai.ElVariklis;
import com.vcs.lects.l09.vehicle.varikliai.SuVarikliu;
import com.vcs.lects.l09.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public class PaspirtukasEV extends TrPriemoneImpl implements SuVarikliu<ElVariklis> {

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

    @Override
    public ElVariklis getVariklis() {
        return new ElVariklis();
    }

}
