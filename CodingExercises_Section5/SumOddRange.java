package com.justincreighton;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = -1;
        boolean flag;
        if (start > 0) {
            if (end >= start) {
                sum = 0;
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum += i;
                    }
                }
            }
        }
        return sum;
    }
}
