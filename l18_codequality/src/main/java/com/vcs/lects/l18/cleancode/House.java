package com.vcs.lects.l18.cleancode;

public class House {


    private int size;

    private String address;

    private int type;

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public int getType() {
        return type;
    }

    public static void main(String[] args) {
        House house = new House();

        house.getAddress();
    }
}
