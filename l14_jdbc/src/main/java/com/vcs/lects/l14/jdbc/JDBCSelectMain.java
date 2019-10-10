package com.vcs.lects.l14.jdbc;

import com.vcs.lects.l14.jdbc.model.Person;

public class JDBCSelectMain {

    public static void main(String[] args) {

        PersonToDb pdb = new PersonToDb("jdbc:postgresql://cloud:5432/appdb", "postgres", "postgre");

        for( String line : pdb.selectPersons()) {
            System.out.println(line);
        }

        pdb.close();
        System.out.println("Done");
    }
}
