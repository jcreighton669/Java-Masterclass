package com.justincreighton;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int i;
        int min;
        int gcd = -1;
        if (first < 10 || second < 10 ) {
            return gcd;
        }
        else {
            gcd = 1;
            if (first > second) {
                min = second;
            }
            else {
                min = first;
            }
            for (i = 2; i <= min; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
