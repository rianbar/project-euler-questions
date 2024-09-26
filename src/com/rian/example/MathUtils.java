package com.rian.example;

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
}
