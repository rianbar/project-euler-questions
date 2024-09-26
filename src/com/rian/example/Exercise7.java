package com.rian.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.rian.lib.MathUtils;

public class Exercise7 {
    public static final int LIMIT = 10001;

    public static void main(String[] args) {
        List<Integer> result = primeListGenerate(LIMIT);
        System.out.println(result.get(result.size() -1));
    }

    public static List<Integer> primeListGenerate(int value) {
        return IntStream.iterate(1, n -> n + 1)
                .filter(MathUtils::isPrime)
                .limit(value)
                .boxed()
                .collect(Collectors.toList());
    }
}
