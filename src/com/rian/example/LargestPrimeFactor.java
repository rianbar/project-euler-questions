package com.rian.example;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        long i = 2;

        while (i * i <= number) {
            if (number % i == 0) {
                number /= i;
            } else {
                i++;
            }
        }

        System.out.println(number);
    }
}
