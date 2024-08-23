package com.rian.example;

import java.util.function.Predicate;

public class Multiple {

    public static void main(String[] args) {
        final int LIMIT = 1000;
        int result = 0;

        Predicate<Integer> isMultipleOfThreeOrFive = n -> n % 3 == 0 || n % 5 == 0;

        for (int i = 0; i < LIMIT; i++) {
            if(isMultipleOfThreeOrFive.test(i)) result += i;
        }

        System.out.println(result);
    }
}
