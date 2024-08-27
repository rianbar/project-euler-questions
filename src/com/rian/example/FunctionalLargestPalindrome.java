package com.rian.example;

import java.util.stream.IntStream;

public class FunctionalLargestPalindrome {
    public static void main(String[] args) {
        int stream = IntStream.rangeClosed(100, 999)
                .flatMap(n -> IntStream.range(n, 999).map(j -> j * n))
                .filter(FunctionalLargestPalindrome::isPalindrome)
                .max().orElse(-1);

        System.out.println(stream);
    }

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
}
