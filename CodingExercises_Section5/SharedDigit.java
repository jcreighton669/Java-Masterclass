package com.justincreighton;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        int[] number1Digits = new int[2];
        int[] number2Digits = new int[2];
        int temp1;
        int temp2;
        boolean flag = false;
        if (number1 >=10 && number1 <= 99) {
            if (number2 >= 10 && number2 <= 99) {
                for (int i = 0; i < 2; i++) {
                    temp1 = number1 % 10;
                    temp2 = number2 % 10;
                    number1Digits[i] = temp1;
                    number2Digits[i] = temp2;
                    number1 /= 10;
                    number2 /= 10;
                }

                for (int i = 0; i < 2; i++) {
                    if (number1Digits[i] == number2Digits[i] || number1Digits[0] == number2Digits[1]) {
                        flag = true;
                        break;
                    }
                }
            }
        }

        return flag;
    }
}
