package com.codecool;

public class Challenge {

    public static int minPositive(int a, int b) {

        if (a < 0 && b > 0) return b;
        else if (b < 0 && a > 0) return a;
        else if (b == 0 && a > 0) return a;
        else if (a == 0 && b > 0) return b;
        else if (Math.min(a, b) >= 0) return Math.min(a, b);

        return -1;

    }
}
