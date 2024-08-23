package com.rian.example;

public class Fibonacci {
    public static void main(String[] args) {
        final int LIMIT = 4_000_000;
        int prev = 1;
        int cur = 2;
        int aux = 0;
        int sum = 2;

        while(aux <= LIMIT) {
            aux = prev + cur;
            prev = cur;
            cur = aux;

            if(cur % 2 == 0) sum += cur;
        }

        System.out.println(sum);
    }
}
