package com.rian.example;

import java.util.stream.IntStream;

import com.rian.lib.MathUtils;

public class LargestPalindrome {
    public static void main(String[] args) {
        int largestPalidrome = IntStream.rangeClosed(100, 999)
            .flatMap(i -> IntStream.range(i, 999)
                .map(j -> j * i)
                .filter(j -> MathUtils.isPalindrome(j)))
                .max().orElse(0);

        System.out.println(largestPalidrome);
    }
}
