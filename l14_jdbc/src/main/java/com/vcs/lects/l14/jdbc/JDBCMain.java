package com.vcs.lects.l14.jdbc;

import com.vcs.lects.l14.jdbc.model.Person;

public class JDBCMain {

    public static void main(String[] args) {

        PersonToDb pdb = new PersonToDb("jdbc:postgresql://cloud:5432/appdb", "postgres", "postgre");

        for (int i = 0; i < 100; i++) {
            pdb.insertPerson(new Person("Tomas"+i, "Pavardauskas"+i));
        }

        pdb.close();
        System.out.println("Done");
    }

}
