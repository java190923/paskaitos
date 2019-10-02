/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l07.vehicle;

/**
 *
 * @author owr
 */
public class Street extends Object {

    private static final int MAX_SLOTS = 5;

    private TrPriemone[] parking = new TrPriemone[MAX_SLOTS];
    private int parkingUsage = 0;

    public void cars() {

        Object obj = new BMW(AutoColor.BLACK, ""); // Viskas Javoj yra Objektai :)
        //new BMW(CarColor.BLACK, "").notify(); // Object metodas

        System.out.println("Fastest: " + findFastestCarInParking());

        int slotIndex = 0;
        slotIndex = parkACar(new BMW(AutoColor.RED, "330D"));
        System.out.println("parking result: " + slotIndex);

        // slotIndex = parkACar(new Lamborgini(CarColor.BLACK));
        slotIndex = parkACar(new Lamborgini());
        System.out.println("parking result: " + slotIndex);

        slotIndex = parkACar(new Audi());
        System.out.println("parking result: " + slotIndex);

        System.out.println("Fastest: " + findFastestCarInParking());

        slotIndex = parkACar(new BMW(AutoColor.BLACK, "330D"));
        System.out.println("parking result: " + slotIndex);

        slotIndex = parkACar(new PaspirtukasEV());
        System.out.println("parking result: " + slotIndex);

        slotIndex = parkACar(new PaspirtukasEV());
        System.out.println("parking result: " + slotIndex);

        System.out.println("Fastest: " + findFastestCarInParking());

        if (leaveParking(1)) {
            System.out.println("Atsilaisvino viena vieta");
        }

        slotIndex = parkACar(new PaspirtukasEV());
        System.out.println("parking result: " + slotIndex);

        System.out.println("Fastest: " + findFastestCarInParking());

        for (TrPriemone v : parking) {
            if (v != null) {
//                System.out.print("Car: " + v.getClass().getSimpleName());
//                if (v instanceof Car) {
//                    //System.out.println("CAR: " + ((Car) v).getColor());
//                    System.out.print("CAR: " + v);
//                } else {
//                    System.out.print("NOT CAR: " + v);
//                }

                System.out.print((v instanceof Automobilis ? "CAR: " : "Not CAR: "));
                System.out.println(v);
            } else {
                System.out.println("- empty -");
            }

        }

//        Car car = new BMW(CarColor.RED, "330D");
//
//        System.out.println("Color" + car.getColor());
//        System.out.println("Engine " + car.getEngine());
//
//        car = new Lamborgini();
//
//        System.out.println("Color" + car.getColor());
//        System.out.println("Engine " + car.getEngine());
    }

    public int parkACar(TrPriemone car) {

        for (int i = 0; i < MAX_SLOTS; i++) {
            if (parking[i] == null) {
                parking[i] = car;
                return i;
            }
        }

        return -1;
    }

    public TrPriemone findFastestCarInParking() {
        TrPriemone fastest = null;
        int fastestSpeed = -1;
        for (TrPriemone vehicle : parking) {

            if (vehicle != null) {
                if (fastestSpeed < vehicle.getSpeed()) {
                    fastestSpeed = vehicle.getSpeed();
                    fastest = vehicle;
                }
            }

        }
        if (fastestSpeed > -1) {
            return fastest;
        }
        return null;
    }

    @Deprecated
    public boolean leaveParking(int indexSlot) {

        if (parking[indexSlot] != null) {
            parking[indexSlot] = null;
            return true;
        }

        return false;
    }

    public boolean leaveParking(TrPriemone v) {

        //TODO
        //FIXME
        return false;
    }

    public int countFreeSlots() {

        int c = 0;
        for (TrPriemone vehicle : parking) {
            if (vehicle == null) {
                c++;
            }

        }

        return c;
    }

    public static void main(String[] args) {

        Street str = new Street();
        str.cars();
    }

}
