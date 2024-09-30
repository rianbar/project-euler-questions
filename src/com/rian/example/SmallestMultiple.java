package com.rian.example;

import java.util.stream.IntStream;

public class SmallestMultiple {
    public static void main(String[] args) {

        int smallest = IntStream.iterate(2, j -> j + 1)
            .filter(SmallestMultiple::isMultiple)
            .findFirst().orElse(0);

        System.out.println(smallest);
    }

    public static boolean isMultiple(int n) {
        return IntStream.rangeClosed(1, 20).allMatch(j -> n % j == 0);
    }
}
