package com.vcs.lects.l12.patterns.singleton.allinone;

import com.vcs.lects.l12.patterns.singleton.dbconn.DBConnection;

public class DBConnction2 {


    private static DBConnction2 conn;

    public static DBConnction2 getConnction() {
        System.out.println("getting connection...");

        if (conn == null) {
            conn = new DBConnction2();
        }

        if (!conn.isStillAlive()) {
            conn = new DBConnction2();
        }


        return conn;
    }

    private DBConnction2() {
        System.out.println("Sukurtas CONNECTION: ");
    }


    public boolean isStillAlive() {
        return true;
    }
}
