package com.test.kata.learn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

final class DateManipulator {

    private DateManipulator() {}

    static List<LocalDate> getListBetweenDates(int startDate, int endDate) {
        List<LocalDate> localDates = new ArrayList<>();
        try {
            getLocalDates(startDate, endDate, localDates);
        } catch (Exception e) {
            //do nothing
        }
        return localDates;
    }

    private static void getLocalDates(int startDate, int endDate, List<LocalDate> localDates) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localStartDate = LocalDate.parse(String.valueOf(startDate), formatter);
        LocalDate localEndDate = LocalDate.parse(String.valueOf(endDate), formatter);
        while (!localStartDate.isAfter(localEndDate)) {
            localDates.add(localStartDate);
            localStartDate = localStartDate.plusDays(1);
        }
    }
}
