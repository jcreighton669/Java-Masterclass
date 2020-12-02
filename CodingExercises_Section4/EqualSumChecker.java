package com.justincreighton;

public class EqualSumChecker {
    public static boolean hasEqualSum(int first, int second, int sum) {
        if (first + second == sum) {
            return true;
        }
        return false;
    }
}
