package com.justincreighton;

public class SecondsAndMinutesChallenge {
    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            System.out.println("Invalid Input");
        } else if (seconds < 0 || seconds > 59){
            System.out.println("Invalid Input");
        } else {
            int hours = minutes / 60;
            minutes %= 60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        } else {
            int minutes = seconds / 60;
            int hours = minutes / 60;
            seconds = seconds % 3600;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
    }
}
