package com.justincreighton;


import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void sumUserInput() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
