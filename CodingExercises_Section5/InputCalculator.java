package com.justincreighton;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        long average = 0;
        int counter = 0;

        while (flag) {
            // System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                flag = false;
                average = Math.round((double) sum / counter);
                System.out.println("SUM = " + sum + " AVG = " + average);
            }
        }
    }
}
