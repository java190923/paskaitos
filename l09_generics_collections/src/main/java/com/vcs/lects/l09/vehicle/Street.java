/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.vehicle;

import com.vcs.lects.l09.vehicle.kitos.PaspirtukasEV;
import com.vcs.lects.l09.vehicle.vandens.Laivas;
import com.vcs.lects.l09.vehicle.auto.Audi;
import com.vcs.lects.l09.vehicle.auto.AutoColor;
import com.vcs.lects.l09.vehicle.auto.Automobilis;
import com.vcs.lects.l09.vehicle.auto.BMW;
import com.vcs.lects.l09.vehicle.auto.Lamborgini;
import com.vcs.lects.l09.vehicle.auto.Passat;
import com.vcs.lects.l09.vehicle.orotr.OroBalionas;
import com.vcs.lects.l09.vehicle.varikliai.E95;
import com.vcs.lects.l09.vehicle.varikliai.EV;
import com.vcs.lects.l09.vehicle.varikliai.ElVariklis;
import com.vcs.lects.l09.vehicle.varikliai.SuVarikliu;
import com.vcs.lects.l09.vehicle.varikliai.TDI;
import com.vcs.lects.l09.vehicle.varikliai.V12;
import com.vcs.lects.l09.vehicle.varikliai.Variklis;
import com.vcs.lects.l09.vehicle.varikliai.VidausDegimo;

/**
 *
 * @author owr
 */
public class Street extends Object {

    public void cars() {

        Automobilis<TDI> audiTDI = new Audi<>(new TDI());
        Automobilis<EV> audiEV = new Audi<>(new ElVariklis());

        pakrautiBaterija(audiEV);
        isipiltiDyzelio(audiTDI);

        isipiltiE95(new Lamborgini());

    }

    private void pakrautiBaterija(Automobilis<? extends EV> auto) {

        auto.getVariklis().ikrauti();
    }

    private void isipiltiDyzelio(Automobilis<? extends TDI> auto) {

        auto.getVariklis().pripiltiKuro();
        auto.getVariklis().patiklintiTepala("");
    }

    private void isipiltiE95(Automobilis<? extends E95> auto) {

        auto.getVariklis().pripiltiKuro();
        auto.getVariklis().patiklintiTepala("");
    }

    public static void main(String[] args) {

        Street str = new Street();
        str.cars();
    }

}
