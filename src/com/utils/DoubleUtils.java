package com.utils;

public class DoubleUtils {
    public static boolean equals(double a, double b) {
        return Math.abs(a - b) < 0.00001;
    }
}
