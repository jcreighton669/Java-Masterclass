package com.justincreighton;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        boolean flag = false;
        int sum = 0;

        if (number >= 1){
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                flag = true;
            }
        }
        return flag;
    }
}
