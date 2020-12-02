package com.justincreighton;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long year = days / 365;
            days = days % 365;

            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
