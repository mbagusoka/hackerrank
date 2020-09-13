package com.test.kata.common;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class NonSerializationGenerator {

    private NonSerializationGenerator() {
    }

    public static List<String> generate(String prefix, int count) {
        validateRequest(prefix, count);
        return IntStream.range(0, count)
                .mapToObj(x -> String.format("%s-%s", prefix, getHexaTimestamp(x)))
                .collect(Collectors.toList());
    }

    private static String getHexaTimestamp(int x) {
        return Long.toHexString(Instant.now().toEpochMilli() + x).toUpperCase();
    }

    private static void validateRequest(String prefix, int count) {
        if (null == prefix || prefix.trim().isEmpty()) {
            throw new IllegalArgumentException("Prefix cannot be empty");
        }
        if (count < 1) {
            throw new IllegalArgumentException("Count cannot be less than 1");
        }
    }
}
