/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l08.vehicle.auto;

import com.vcs.lects.l08.vehicle.KritDaviklis;
import com.vcs.lects.l08.vehicle.varikliai.TDI;
import com.vcs.lects.l08.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 */
public class Audi extends Automobilis implements KritDaviklis {

    private Variklis variklis;

    public Audi(Variklis Variklis) {
        this.variklis = Variklis;
    }

    public Audi() {
        this.variklis = new TDI();
    }

    @Override
    public int getSpeed() {
        return 40;
    }

    @Override
    public Variklis getVariklis() {

        return variklis;
    }

}
