package com.rian.example;

import java.util.List;

import com.rian.lib.MathUtils;

public class Exercise7 {
    public static final int LIMIT = 10001;

    public static void main(String[] args) {
        List<Integer> result = MathUtils.primeListGenerate(LIMIT);
        System.out.println(result.get(result.size() -1));
    }
}
