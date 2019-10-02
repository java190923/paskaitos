/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l08.vehicle.auto;

import com.vcs.lects.l08.vehicle.TrPriemoneImpl;
import com.vcs.lects.l08.vehicle.varikliai.SuVarikliu;
import com.vcs.lects.l08.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public abstract class Automobilis extends TrPriemoneImpl implements SuVarikliu {

    private AutoColor color;
    

    public Automobilis(AutoColor color) {
        this.color = color;
      
    }

    public Automobilis() {

    }

    @Override
    public void move() {
        System.out.println("Vaira suku ir vaziuoju : " + getSpeed() + " km/h");
    }

    @Override
    public int getSpeed() {
        return 120;
    }

    public AutoColor getColor() {
        return color;
    }

    public void setColor(AutoColor color) {
        this.color = color;
    }



}
