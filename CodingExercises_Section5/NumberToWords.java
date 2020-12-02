package com.justincreighton;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int numberLength = getDigitCount(number);
            String[] myStringArray = new String[numberLength];
            number = reverse(number);
            for (int i = 0; i < numberLength; i++) {
                int digit = number % 10;
                number /= 10;
                switch (digit) {
                    case 0:
                        myStringArray[i] = "Zero";
                        break;
                    case 1:
                        myStringArray[i] = "One";
                        break;
                    case 2:
                        myStringArray[i] = "Two";
                        break;
                    case 3:
                        myStringArray[i] = "Three";
                        break;
                    case 4:
                        myStringArray[i] = "Four";
                        break;
                    case 5:
                        myStringArray[i] = "Five";
                        break;
                    case 6:
                        myStringArray[i] = "Six";
                        break;
                    case 7:
                        myStringArray[i] = "Seven";
                        break;
                    case 8:
                        myStringArray[i] = "Eight";
                        break;
                    case 9:
                        myStringArray[i] = "Nine";
                        break;
                }
            }
            for (int i = 0; i < numberLength; i++) {
                System.out.print(myStringArray[i] + " ");
            }
        }
    }

    public static int reverse(int number) {
        int tempDigit;
        int tempNumber = 0;
        while (number != 0) {
            tempNumber *= 10;
            tempDigit = number % 10;
            tempNumber += tempDigit;
            number /= 10;
        }
        return tempNumber;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number < 0) {
            digitCount = -1;
        } else {
            digitCount = String.valueOf(number).length();
        }
        return digitCount;
    }
}