/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.vehicle.orotr;

import com.vcs.lects.l09.vehicle.KritDaviklis;
import com.vcs.lects.l09.vehicle.OroTransportas;
import com.vcs.lects.l09.vehicle.TrPriemoneImpl;

/**
 *
 * @author owr
 */
public class NaikintuvasF35 extends OroTransportas implements KritDaviklis{

    @Override
    public int getSpeed() {
        return 1600;
    }

    @Override
    public void move() {
        System.out.println("... vemsiu... po 3G : " + getSpeed() + " km/h");
    }

}
