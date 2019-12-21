package com.test.kata.learn;

import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.List;

public class DateManipulatorTest extends TestCase {

    public void testInvalidDate() {
        List<LocalDate> localDates = DateManipulator.getListBetweenDates(0, 0);
        assertNotNull(localDates);
        assertEquals(0, localDates.size());
    }

    public void testStartDateMoreThanEndDate() {
        List<LocalDate> localDates = DateManipulator.getListBetweenDates(20190102, 20190101);
        assertEquals(0, localDates.size());
    }

    public void testValidDate() {
        List<LocalDate> localDates = DateManipulator.getListBetweenDates(20190101, 20190103);
        assertEquals(3, localDates.size());
        assertEquals("2019-01-01", localDates.get(0).toString());
        assertEquals("2019-01-02", localDates.get(1).toString());
        assertEquals("2019-01-03", localDates.get(2).toString());
    }
}
