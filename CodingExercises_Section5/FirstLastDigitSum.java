package com.justincreighton;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = -1;
        if (number < 0) {
            return sum;
        } else {
            int first = number % 10;
            while (number >= 10) {
                number /= 10;
            }
            int last = number;
            sum = first + last;
        }
        return sum;
    }
}
