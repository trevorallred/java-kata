package com.trevorallred.kata.PrimeFactors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactors {
    private static Set<Integer> primes = new HashSet<>();

    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        primes.add(2);
        primes.add(3);

        number = reduceNumberByFactor(number, primeFactors);
        if (number > 1) {
            primeFactors.add(number);
        }
        return primeFactors;
    }

    private static int reduceNumberByFactor(int number, List<Integer> primeFactors) {
        for (Integer prime : primes) {
            if (number % prime == 0) {
                primeFactors.add(prime);
                number /= prime;
                number = reduceNumberByFactor(number, primeFactors);
            }
        }
        return number;
    }
}
