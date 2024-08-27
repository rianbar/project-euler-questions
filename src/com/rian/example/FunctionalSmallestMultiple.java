package com.rian.example;

import java.util.stream.IntStream;

public class FunctionalSmallestMultiple {
    public static void main(String[] args) {
        int stream = IntStream.iterate(1, n -> n + 1)
                .flatMap(n -> IntStream.rangeClosed(1, 20)
                        .filter(j -> n % j != 0)
                        .skip(1)).findFirst().orElse(-1);
        System.out.println(stream);
    }
}
