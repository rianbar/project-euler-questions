package com.rian.example;

public class SmallestMultiple {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 1;

        while(n1 < 20) {
            if (n2 % n1 == 0) {
                n1 += 1;
            } else {
                n1 = 1;
                n2 += 1;
            }
        }
        System.out.println(n2);
    }
}
