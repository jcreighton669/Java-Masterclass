package com.justincreighton;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        boolean flag = false;
        int lastDigit1, lastDigit2, lastDigit3;
        if (isValid(num1)) {
            if (isValid(num2)) {
                if (isValid(num3)) {
                    lastDigit1 = num1 % 10;
                    lastDigit2 = num2 % 10;
                    lastDigit3 = num3 % 10;
                    if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
                        flag = true;
                    }
                }
            }
        }

        return flag;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
