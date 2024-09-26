package com.rian.example;

import java.util.stream.LongStream;

public class Exercise12Optimized {
    public static void main(String[] args) {
        long result = LongStream.iterate(1, n -> n + 1)
            .map(n -> n * (n + 1) / 2)
            .filter(sn -> divisorsVerify(sn) > 500)
            .findFirst().orElse(0);
        
        System.out.println(result);
    }

    public static long divisorsVerify(long sn) {
        return LongStream.rangeClosed(1, (long) Math.sqrt(sn))
            .filter(i -> sn % i == 0)
            .flatMap(i -> {
                return i == sn / i ? LongStream.of(i) : LongStream.of(i, sn / i);
            })
            .count();
    }
}
