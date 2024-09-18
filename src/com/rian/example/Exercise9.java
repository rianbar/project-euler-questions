package com.rian.example;

import java.util.stream.IntStream;

public class Exercise9 {
    public static void main(String[] args) {
        IntStream.range(1, 1000)
                .flatMap(n1 -> IntStream.range(n1 + 1, 1000)).findFirst();
    }

    private static boolean isPitagoric(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}
