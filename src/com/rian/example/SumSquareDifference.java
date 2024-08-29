package com.rian.example;

import java.util.stream.IntStream;

public class SumSquareDifference {
    public static final int LIMIT = 100;

    public static void main(String[] args) {
        int s1 = IntStream.rangeClosed(1, LIMIT).map(n -> n * n).sum();
        int s2 = IntStream.rangeClosed(1, LIMIT)
                .reduce(0, Integer::sum);
        int squareNumbersSum = s2 * s2;
        int result = squareNumbersSum - s1;

        System.out.println(result);
    }
}
