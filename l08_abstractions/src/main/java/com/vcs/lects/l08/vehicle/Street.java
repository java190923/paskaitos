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
public class Street extends Object {

    public void cars() {

        TrPriemone v = new Laivas();
        TrPriemone[] uostas = new TrPriemone[10];

        uostas[0] = new Laivas();
        uostas[1] = new Audi();
        uostas[2] = new PaspirtukasEV();
        uostas[3] = null;
        uostas[4] = new Passat();

        for (TrPriemone t : uostas) {
            if (t != null) {
                t.move();

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
