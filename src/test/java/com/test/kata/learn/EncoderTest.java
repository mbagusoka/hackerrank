package com.test.kata.learn;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EncoderTest {

    @Test
    public void givenNullToken_whenEncode_shouldReturnNull() {
        assertNull(Encoder.convertHexaModified(null));
    }

    @Test
    public void givenEmptyToken_whenEncode_shouldReturnEmpty() {
        assertEquals("", Encoder.convertHexaModified(""));
    }

    @Test
    public void givenAlphabet_whenEncode_shouldReturnSame() {
        assertEquals("ABC", Encoder.convertHexaModified("ABC"));
    }

    @Test
    public void givenAlphaNumeric_whenEncode_shouldReturnSame() {
        assertEquals("ABC123", Encoder.convertHexaModified("ABC123"));
    }

    @Test
    public void givenValidRequest_whenEncode_shouldReturnEncodedOne() {
        assertEquals("EZ225V7n", Encoder.convertHexaModified("12345678"));
    }

    @Test
    public void givenValidRequest_whenEncode_shouldReturnEncodedTwo() {
        assertEquals("9u725w2uE", Encoder.convertHexaModified("876657391"));
    }
}
