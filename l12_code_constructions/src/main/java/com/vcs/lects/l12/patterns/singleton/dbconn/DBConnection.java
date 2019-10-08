package com.vcs.lects.l12.patterns.singleton.dbconn;

public class DBConnection {


    private static int counter = 0;


    DBConnection() {
        counter++;
        System.out.println("Sukurtas CONNECTION: " + counter);
    }


    public boolean isStillAlive() {
        return true;
    }
}
