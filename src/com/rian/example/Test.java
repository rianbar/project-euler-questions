package com.rian.example;

import java.util.stream.IntStream;
import java.util.function.IntSupplier;

public class Test {
    public static void main(String[] args) {
        IntSupplier supplier = new IntSupplier() {
            private int current = 1;

            @Override
            public int getAsInt() {
                return current++;
            }
        };

        IntStream.generate(supplier)
                .limit(10) // Limita o fluxo para os primeiros 10 elementos
                .forEach(System.out::println);
    }
}
