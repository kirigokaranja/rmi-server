package com.example.rmiserver;

import java.util.Date;

public class CalculateImpl implements Calculate {
    @Override
    public String sum(int number) {
        System.out.println("<--------- Server Response ----------->");
        System.out.println("Number from Client: " + number);
        System.out.println("Response Time: " + new Date());
        int summation = number + number;
        return "The sum of the number is: " + summation;
    }
}
