package com.justincreighton;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int temp;
        if (number >= 0) {
            while (number != 0) {
                temp = number % 10;
                number /= 10;
                if (temp % 2 == 0) {
                    sum += temp;
                }
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
