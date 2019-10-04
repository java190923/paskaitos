/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.vehicle.auto;

import com.vcs.lects.l09.vehicle.KritDaviklis;
import com.vcs.lects.l09.vehicle.varikliai.E95;
import com.vcs.lects.l09.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public class BMW extends Automobilis<E95> implements KritDaviklis {

    public BMW(AutoColor color) {
        super();
        setColor(color);

    }

    @Override
    public int getSpeed() {
        return 140;
    }

    @Override
    public E95 getVariklis() {
        return new E95();
    }

}
