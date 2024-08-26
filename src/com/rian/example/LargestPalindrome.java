package com.rian.example;

public class LargestPalindrome {
    public static void main(String[] args) {
        int largest = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int result = i * j;
                if (isPalindrome(result) && result > largest) {
                    largest = result;
                }
            }
        }

        System.out.println(largest);
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
