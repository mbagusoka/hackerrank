package com.test.kata.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public final class PlacementRecommendation {

    private PlacementRecommendation() {}

    public static List<Integer> rotateList(List<Integer> integers, int rotateCount) {
        Collections.rotate(integers, rotateCount);
        return integers;
    }

    public static List<List<Integer>> divideList(List<Integer> integers) {
        AtomicInteger count = new AtomicInteger();
        int divider = (int) Math.ceil(integers.size() / (double) 3);
        Collection<List<Integer>> result = integers.stream().collect(Collectors.groupingBy(ints ->
                count.getAndIncrement() / divider)
        ).values();
        return new ArrayList<>(result);
    }

    public static List<Integer> filterByPriorityList(List<Integer> integers, int priority) {
        List<Integer> filteredInts = new ArrayList<>();
        for (int i = priority - 1; i < integers.size(); i++) {
            filteredInts.add(integers.get(i));
        }
        int remainder = integers.size() - filteredInts.size();
        for (int i = remainder - 1; i >= 0; i--) {
            filteredInts.add(integers.get(i));
        }
        return filteredInts;
    }
}
