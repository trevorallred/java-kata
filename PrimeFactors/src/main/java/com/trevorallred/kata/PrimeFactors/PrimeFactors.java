package com.trevorallred.kata.PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<>();
        if (number == 2) {
            primes.add(2);
        }
        return primes;
    }
}
