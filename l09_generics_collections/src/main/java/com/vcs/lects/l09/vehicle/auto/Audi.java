/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.vehicle.auto;

import com.vcs.lects.l09.vehicle.KritDaviklis;
import com.vcs.lects.l09.vehicle.varikliai.TDI;
import com.vcs.lects.l09.vehicle.varikliai.Variklis;

/**
 *
 * @author owr
 * @param <V>
 */
public class Audi<V extends Variklis> extends Automobilis<V> implements KritDaviklis {

    private V variklis;

    public Audi(V Variklis) {
        this.variklis = Variklis;
    }

//    public Audi() {
//        this.variklis = new TDI();
//    }
    @Override
    public int getSpeed() {
        return 40;
    }

    @Override
    public V getVariklis() {

        return variklis;
    }

}
