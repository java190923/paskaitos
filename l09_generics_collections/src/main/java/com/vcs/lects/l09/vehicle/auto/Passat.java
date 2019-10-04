/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.vehicle.auto;

import com.vcs.lects.l09.vehicle.varikliai.TDI;
import com.vcs.lects.l09.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public class Passat extends Automobilis<TDI> {

    @Override
    public void move() {
        System.out.println("VW tiesiog vaziuoja ir koks skirtumas ant kiek, gi ne del greicio perkam tokia");
    }

    @Override
    public TDI getVariklis() {
        return new TDI();
    }

}
