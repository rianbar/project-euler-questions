package com.rian.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise7 {
    public static final int LIMIT = 10001;

    public static void main(String[] args) {
        List<Integer> result = primeListGenerate(LIMIT);
        System.out.println(result.get(result.size() -1));
    }

    public static List<Integer> primeListGenerate(int value) {
        return IntStream.iterate(1, n -> n + 1)
                .filter(Exercise7::isPrime)
                .limit(value)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number)
                .noneMatch(n -> number % n == 0);
    }
}
