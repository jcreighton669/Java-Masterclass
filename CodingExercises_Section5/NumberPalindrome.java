package com.justincreighton;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int processNumber = Math.abs(number);
        int tempNumber = 0;
        int temp;
        while (processNumber != 0) {
            tempNumber *= 10;
            temp = processNumber % 10;
            tempNumber += temp;
            processNumber /= 10;
        }
        if (Math.abs(number) == Math.abs(tempNumber)) {
            return true;
        }
        return false;
    }
}
