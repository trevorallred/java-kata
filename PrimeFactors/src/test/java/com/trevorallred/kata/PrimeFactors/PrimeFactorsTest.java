package com.trevorallred.kata.PrimeFactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Write a class named “PrimeFactors” that has one static method: generate.
 * The generate method takes an integer argument and returns a List<Integer>.
 * That list contains the prime factors in numerical sequence.
 * "Prime Factorization" is finding which prime numbers multiply together to make the original number.
 * http://www.mathsisfun.com/prime-factorization.html
 */
public class PrimeFactorsTest {

    private List<Integer> list(int... primes) {
        List<Integer> primeList = new ArrayList<>();
        for (int prime : primes) {
            primeList.add(prime);
        }
        return primeList;
    }

    @Test
    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() throws Exception {
        assertEquals(list(2), PrimeFactors.generate(2));
    }
}
