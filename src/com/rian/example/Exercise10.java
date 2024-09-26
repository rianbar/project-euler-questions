package com.rian.example;

import java.util.stream.IntStream;

import com.rian.lib.MathUtils;

public class Exercise10 {
    public static void main(String[] args) {
        long result = IntStream.rangeClosed(2, 2_000_000)
                .parallel()
                .filter(MathUtils::isPrime)
                .asLongStream()
                .sum();

        System.out.println(result);
    }
}
