package ru.liga.intership.badcode.service;

import java.sql.ResultSet;

public class CalculatorService {

    final double COUNT_OF_CENTIMETERS_IN_METERS = 100;
    double totalImt = 0d;
    static int countOfUsers = 0;

    public void getAverageBMI() throws Exception {

        ResultSet users = ConnectionService.getAdultMaleUsers();
        while (users.next()) {
            double weight = users.getLong("weight");
            double height = users.getLong("height") / COUNT_OF_CENTIMETERS_IN_METERS;
            double imt = weight / (height * height);
            totalImt = totalImt + imt;
            countOfUsers++;
        }
        System.out.println("Average imt - " + totalImt / countOfUsers);
    }
}

