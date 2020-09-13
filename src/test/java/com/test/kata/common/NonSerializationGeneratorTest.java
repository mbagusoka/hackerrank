package com.test.kata.common;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NonSerializationGeneratorTest {

    private static final String DUMMY = "DUM";

    @Test(expected = IllegalArgumentException.class)
    public void givenEmptyPrefix_whenGenerate_shouldThrowException() {
        NonSerializationGenerator.generate(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInvalidCount_whenGenerate_shouldThrowException() {
        NonSerializationGenerator.generate(DUMMY, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeCount_whenGenerate_shouldThrowException() {
        NonSerializationGenerator.generate(DUMMY, -1);
    }

    @Test
    public void givenValidRequest_whenGenerate_shouldReturnCorrectValue() {
        List<String> sn = NonSerializationGenerator.generate(DUMMY, 1);
        assertEquals(1, sn.size());
        assertTrue(sn.get(0).contains(DUMMY));
    }

    @Test
    public void givenValidRequest_whenGenerate_shouldReturnSecondPartHexa() {
        List<String> sn = NonSerializationGenerator.generate(DUMMY, 1);
        String secondPart = sn.get(0).split("-")[1];
        String alphaNumericRegex = "^[A-Za-z0-9]*";
        assertTrue(secondPart.matches(alphaNumericRegex));
    }

    @Test
    public void givenValidRequest_whenGenerate_shouldReturnCorrectCount() {
        List<String> sn = NonSerializationGenerator.generate(DUMMY, 100000);
        assertEquals(100000, sn.stream().distinct().count());
    }
}
