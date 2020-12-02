package com.justincreighton;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void minAndMaxInputChallenge() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                flag = false;
                System.out.println("Minimum number = " + min);
                System.out.println("Maximum number = " + max);
            }
        }

        scanner.close();
    }
}
