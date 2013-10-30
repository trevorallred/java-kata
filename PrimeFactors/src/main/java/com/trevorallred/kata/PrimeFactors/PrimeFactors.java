package com.trevorallred.kata.PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        number = reduceNumberByFactor(number, primeFactors);
        if (number > 1) {
            primeFactors.add(number);
        }
        return primeFactors;
    }

    private static int reduceNumberByFactor(int number, List<Integer> primeFactors) {
        if (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
            number = reduceNumberByFactor(number, primeFactors);
        }
        return number;
    }
}
