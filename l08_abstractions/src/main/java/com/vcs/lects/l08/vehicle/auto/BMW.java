/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l08.vehicle.auto;

import com.vcs.lects.l08.vehicle.KritDaviklis;
import com.vcs.lects.l08.vehicle.varikliai.E95;
import com.vcs.lects.l08.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public class BMW extends Automobilis implements KritDaviklis {

    public BMW(AutoColor color) {
        super();
        setColor(color);

    }

    @Override
    public int getSpeed() {
        return 140;
    }

    @Override
    public Variklis getVariklis() {
        return new E95();
    }

}
