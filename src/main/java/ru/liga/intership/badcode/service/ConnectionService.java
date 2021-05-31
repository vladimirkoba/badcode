package ru.liga.intership.badcode.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionService {

    public static ResultSet getAdultMaleUsers() throws Exception {
        final String URL = "jdbc:hsqldb:mem:test";
        final String USER = "sa";
        final String PASSWORD = "";
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = conn.createStatement();
        return statement.executeQuery("SELECT * FROM person WHERE sex = 'male' AND age > 18");
    }
}
