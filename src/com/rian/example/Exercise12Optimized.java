package com.rian.example;

import java.util.stream.LongStream;

import com.rian.lib.MathUtils;

public class Exercise12Optimized {
    public static void main(String[] args) {
        long result = LongStream.iterate(1, n -> n + 1)
            .map(n -> n * (n + 1) / 2)
            .filter(sn -> MathUtils.divisorsVerify(sn) > 500)
            .findFirst().orElse(0);
        
        System.out.println(result);
    }
}
