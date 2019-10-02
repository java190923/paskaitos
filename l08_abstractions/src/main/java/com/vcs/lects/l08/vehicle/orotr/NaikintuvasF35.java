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
public class NaikintuvasF35 extends TrPriemone {

    @Override
    public int getSpeed() {
        return 1600;
    }
    
    @Override
    public void move() {
        System.out.println("... vemsiu... po 3G : " + getSpeed() + " km/h");
    }

}
