/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l08.vehicle;

import com.vcs.lects.l08.vehicle.kitos.PaspirtukasEV;
import com.vcs.lects.l08.vehicle.vandens.Laivas;
import com.vcs.lects.l08.vehicle.auto.Audi;
import com.vcs.lects.l08.vehicle.auto.AutoColor;
import com.vcs.lects.l08.vehicle.auto.BMW;
import com.vcs.lects.l08.vehicle.auto.Passat;
import com.vcs.lects.l08.vehicle.orotr.OroBalionas;
import com.vcs.lects.l08.vehicle.varikliai.E95;
import com.vcs.lects.l08.vehicle.varikliai.EV;
import com.vcs.lects.l08.vehicle.varikliai.SuVarikliu;
import com.vcs.lects.l08.vehicle.varikliai.Variklis;
import com.vcs.lects.l08.vehicle.varikliai.VidausDegimo;

/**
 *
 * @author owr
 */
public class Street extends Object {

    public void cars() {

        TrPriemone[] uostas = new TrPriemone[10];

        uostas[0] = new Laivas();
        uostas[1] = new Audi();
        uostas[2] = new PaspirtukasEV();
        uostas[3] = new BMW(AutoColor.BLACK);
        uostas[4] = new Passat();
        uostas[5] = new Audi(new E95());
        uostas[6] = new OroBalionas();

        for (TrPriemone t : uostas) {
            if (t != null) {
//                t.move();

                if (t instanceof SuVarikliu) {

                    Variklis v = ((SuVarikliu) t).getVariklis();
                    if (v instanceof VidausDegimo) {
                        ((VidausDegimo) v).pripiltiKuro();
                    } else if (v instanceof EV) {
                        ((EV) v).ikrauti();
                    } else {
                        System.out.println("Nezinau kaip papildyti");
                    }

                } else {
                    System.out.println("Nera ko pildyti");
                }

//                if (t instanceof KritDaviklis) {
//                    System.out.println("      Su krituliu davikliu!!!");
//                }
//                System.out.print("Car: " + v.getClass().getSimpleName());
//                if (v instanceof Car) {
//                    //System.out.println("CAR: " + ((Car) v).getColor());
//                    System.out.print("CAR: " + v);
//                } else {
//                    System.out.print("NOT CAR: " + v);
//                }
//
////                System.out.print((v instanceof Car ? "CAR: " : "Not CAR: "));
////                System.out.println(v);
//            } else {
//                System.out.println("- empty -");
//            }
            }
        }
    }

    public static void main(String[] args) {

        Street str = new Street();
        str.cars();
    }

}
