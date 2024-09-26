package com.rian.example;

import java.util.stream.IntStream;

import com.rian.lib.MathUtils;

public class FunctionalLargestPalindrome {
    public static void main(String[] args) {
        int stream = IntStream.rangeClosed(100, 999)
                .flatMap(n -> IntStream.range(n, 999).map(j -> j * n))
                .filter(MathUtils::isPalindrome)
                .max().orElse(-1);

        System.out.println(stream);
    }
}
