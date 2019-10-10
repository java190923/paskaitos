package com.vcs.lects.l14.jdbc;

import com.vcs.lects.l14.jdbc.model.Person;

import java.io.Closeable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonToDb implements Closeable {

    private Connection conn;


    public PersonToDb(String connectionString, String user, String pass) {

        try {
            conn = DriverManager.getConnection(connectionString, user, pass);
//			conn.setAutoCommit(false);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<String> selectPersons() {


        List<String> result = new ArrayList<>();

        Statement sts = null;
        try {

            sts = conn.createStatement();
            ResultSet resultSet = sts.executeQuery("SELECT * FROM person");

            while (resultSet.next()) {
                result.add(resultSet.getString("name") + " " + resultSet.getString("surname"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }


    public void insertPerson(Person person) {

        try {
            Statement sts = conn.createStatement();

            sts.execute("INSERT INTO person(name, surname) VALUES('" + person.getName() + "','" + person.getSurname() + "')");
            sts.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void close() {

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
