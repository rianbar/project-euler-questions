package com.rian.lib;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MathUtils {
    
    public static long divisorsVerify(long sn) {
    return LongStream.rangeClosed(1, (long) Math.sqrt(sn))
        .filter(i -> sn % i == 0)
        .flatMap(i -> {
            return i == sn / i ? LongStream.of(i) : LongStream.of(i, sn / i);
        })
        .count();
    }

    public static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number)
            .noneMatch(n -> number % n == 0);
    }

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static long getMultiplyProduct(String subs) {
        return LongStream.range(0, subs.length())
                .map(n -> parseToInt(subs.charAt((int) n)))
                .reduce(1, (a, b) -> a * b);
    }

    private static int parseToInt(char c) {
        return Integer.parseInt(String.valueOf(c));
    }
}
