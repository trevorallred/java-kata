package com.trevorallred.kata.PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        int divisor = 2;
        while (divisor <= number) {
            if (number % divisor == 0) {
                primeFactors.add(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }

        return primeFactors;
    }
}
