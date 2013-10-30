package com.trevorallred.kata.PrimeFactors;

import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Write a class named “PrimeFactors” that has one static method: generate.
 * The generate method takes an integer argument and returns a List<Integer>.
 * That list contains the prime factors in numerical sequence.
 */
public class PrimeFactorsTest {

    @Test
    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    private List<Integer> list() {
        return null;
    }
}
