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
public class Laivas extends TrPriemone{

    
    //TODO vejo greitis
    
    @Override
    public int getSpeed() {
        return 40;
    }
    
     @Override
    public void move() {
        System.out.println("Per bangas i zvaigzdes : " + getSpeed() + " km/h");
    }
    
}
