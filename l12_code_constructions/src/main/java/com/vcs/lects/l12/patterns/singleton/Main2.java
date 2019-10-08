package com.vcs.lects.l12.patterns.singleton;

import com.vcs.lects.l12.patterns.singleton.allinone.DBConnction2;

public class Main2 {

    public static void main(String[] args) {


        DBConnction2 db = DBConnction2.getConnction();
         db = DBConnction2.getConnction();
         db = DBConnction2.getConnction();
         db = DBConnction2.getConnction();
         db = DBConnction2.getConnction();


    }

}
