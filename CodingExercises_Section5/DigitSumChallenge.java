package com.justincreighton;

public class DigitSumChallenge {
    public static int sumDigits(int number) {
        int sum = -1;
        if (number >= 10) {
            sum = 0;
            int temp = 0;
            while (number != 0) {
                temp = number % 10;
                sum += temp;
                number /= 10;
            }
        }
        return sum;
    }
}
