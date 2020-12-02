package com.justincreighton;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        else {
            for (int i = number; i > 1; i--){
                if (number % i == 0){
                    for (int j = 2; j < i; j++){
                        if (i % j == 0){
                            break;
                        }
                    }
                    number = i;
                }
            }
        }
        return number;
    }
}
