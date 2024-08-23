package com.rian.example;

import java.math.BigInteger;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        final int n = new BigInteger("600851475143").intValue();

        int primeFactor = 2;
        int largestFactor = 0;

        while(n > 0) {
            if((n / primeFactor) % 2 == 0)
        }


    }
}
