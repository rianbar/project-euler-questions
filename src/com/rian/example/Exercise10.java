package com.rian.example;

import java.util.stream.IntStream;

public class Exercise10 {
    public static void main(String[] args) {
        long result = IntStream.rangeClosed(2, 2_000_000)
                .parallel()
                .filter(Exercise7::isPrime)
                .asLongStream()
                .sum();

}
