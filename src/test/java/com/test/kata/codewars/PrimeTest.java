package com.test.kata.codewars;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PrimeTest {

    @Test
    public void testBasic() {
        assertFalse("0  is not prime", Kata.isPrime(0));
        assertFalse("1  is not prime", Kata.isPrime(1));
        assertTrue ("2  is prime", Kata.isPrime(2));
        assertTrue ("73 is prime", Kata.isPrime(73));
        assertFalse("75 is not prime", Kata.isPrime(75));
        assertFalse("-1 is not prime", Kata.isPrime(-1));
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", Kata.isPrime(3));
        assertTrue("5 is prime", Kata.isPrime(5));
        assertTrue("7 is prime", Kata.isPrime(7));
        assertTrue("41 is prime", Kata.isPrime(41));
        assertTrue("5099 is prime", Kata.isPrime(5099));
    }

    @Test
    public void testNotPrime() {
        assertFalse("4 is not prime", Kata.isPrime(4));
        assertFalse("6 is not prime", Kata.isPrime(6));
        assertFalse("8 is not prime", Kata.isPrime(8));
        assertFalse("9 is not prime", Kata.isPrime(9));
        assertFalse("45 is not prime", Kata.isPrime(45));
        assertFalse("-5 is not prime", Kata.isPrime(-5));
        assertFalse("-8 is not prime", Kata.isPrime(-8));
        assertFalse("-41 is not prime", Kata.isPrime(-41));
    }
}
