package com.vcs.lects.l12.patterns.singleton;

import com.vcs.lects.l12.patterns.singleton.allinone.DBConnction2;
import com.vcs.lects.l12.patterns.singleton.dbconn.DBConnection;
import com.vcs.lects.l12.patterns.singleton.dbconn.DBConnectionFactory;

public class Main {

    public static void main(String[] args) {


        DBConnection conn = DBConnectionFactory.createInstance();

        /// ...


        conn = DBConnectionFactory.createInstance();

        /// ...

        conn = DBConnectionFactory.createInstance();

        // ..

        conn = DBConnectionFactory.createInstance();

        DBConnction2 db = DBConnction2.getConnction();

    }
}
