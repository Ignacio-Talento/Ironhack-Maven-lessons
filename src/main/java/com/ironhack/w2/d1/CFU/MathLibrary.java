package com.ironhack.w2.d1.CFU;

import java.util.List;

public class MathLibrary {
    public static int add(int a, int b) {
        return a + b;
    }

    public int sumList(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
