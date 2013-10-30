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
    public void test1() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(list(2, 2), PrimeFactors.generate(4));
    }

    @Test
    public void test6() throws Exception {
        assertEquals(list(2, 3), PrimeFactors.generate(6));
    }

    @Test
    public void test8() throws Exception {
        assertEquals(list(2, 2, 2), PrimeFactors.generate(8));
    }

    @Test
    public void test9() throws Exception {
        assertEquals(list(3, 3), PrimeFactors.generate(9));
    }

    @Test
    public void test147() throws Exception {
        assertEquals(list(3, 7, 7), PrimeFactors.generate(147));
    }
}
