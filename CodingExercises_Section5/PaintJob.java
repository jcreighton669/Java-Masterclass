package com.justincreighton;

import java.util.Scanner;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBucket < 0)) {
            return -1;
        } else {
            double wallArea = width * height;

            double bucketsNeeded = wallArea / areaPerBucket;
            bucketsNeeded -= extraBucket;
            return (int) Math.ceil(bucketsNeeded);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            double wallArea = width * height;

            double bucketsNeeded = wallArea / areaPerBucket;
            return (int) Math.ceil(bucketsNeeded);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            double bucketsNeeded = area / areaPerBucket;
            return (int) Math.ceil(bucketsNeeded);
        }
    }
}
