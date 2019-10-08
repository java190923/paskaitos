package com.vcs.lects.l12.patterns.singleton.dbconn;

public class DBConnectionFactory {

    private DBConnectionFactory() {
    }

    private static DBConnection conn;

    public static DBConnection createInstance() {
        System.out.println("getting connection...");

        if (conn == null) {
            conn = new DBConnection();
        }

        if (!conn.isStillAlive()) {
            conn = new DBConnection();
        }


        return conn;
    }
}
