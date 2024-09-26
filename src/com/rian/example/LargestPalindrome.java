package com.rian.example;

import com.rian.lib.MathUtils;

public class LargestPalindrome {
    public static void main(String[] args) {
        int largest = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int result = i * j;
                if (MathUtils.isPalindrome(result) && result > largest) {
                    largest = result;
                }
            }
        }

        System.out.println(largest);
    }
}
