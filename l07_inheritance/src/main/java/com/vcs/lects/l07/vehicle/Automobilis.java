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
public class Automobilis extends TrPriemone {

    private AutoColor color;
    private String engine;

    public Automobilis(AutoColor color) {
        this.color = color;
          this.engine = "KosminisVariklis";
    }

    public Automobilis() {
        
      
    }

    public AutoColor getColor() {
        return color;
    }

    public void setColor(AutoColor color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "color=" + color + ", engine=" + engine + "} fromObj:" + super.toString();
    }

}
