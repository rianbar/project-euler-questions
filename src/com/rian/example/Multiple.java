package com.rian.example;

import java.util.function.Predicate;

//Find the sum of all the multiples of three or five bellow 1000
public class Multiple {

    public static void main(String[] args) {
        final int LIMIT = 1000;
        int result = 0;

        Predicate<Integer> isMultipleOfThreeOrFive = n -> n % 3 == 0 || n % 5 == 0;

        for (int i = 0; i < LIMIT; i++) {
            if(isMultipleOfThreeOrFive.test(i)) result += i;
        }

        System.out.println("a soma de todos os multiplos de 3 ou 5 até o valor 1000 é " + result);
    }
}
