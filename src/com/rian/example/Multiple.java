package com.rian.example;

import java.util.stream.IntStream;

public class Multiple {

    public static void main(String[] args) {
        final int LIMIT = 1000;

        int stream = IntStream.iterate(0, n -> n + 1)
                .limit(LIMIT)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();

        System.out.println("the sum of all multiples of 3 or 5 is:  " + stream);
    }
}
