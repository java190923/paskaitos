/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l08.vehicle.auto;

import com.vcs.lects.l08.vehicle.varikliai.TDI;
import com.vcs.lects.l08.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public class Passat extends Automobilis {

    @Override
    public void move() {
        System.out.println("VW tiesiog vaziuoja ir koks skirtumas ant kiek, gi ne del greicio perkam tokia");
    }

    @Override
    public Variklis getVariklis() {
        return new TDI();
    }

}
