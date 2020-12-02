package com.justincreighton;

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int bigCountMass = 5;
        int index = 0;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        while (bigCount > 0) {
            index++;
            if ((bigCountMass * index) == goal) {
                return true;
            }
            if ((bigCountMass * index) > goal) {
                index--;
                break;
            }
            bigCount--;
        }
        goal -= (index * bigCountMass);
        return goal <= smallCount;
    }
}
