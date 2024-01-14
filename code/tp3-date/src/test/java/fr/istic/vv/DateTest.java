package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testValidDate() {
        assertDoesNotThrow(() -> new Date(1, 1, 2024));
    }

    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> new Date(30, 2, 2024));
    }

    ///

    @Test
    void testIsValidDate() {
        assertTrue(Date.isValidDate(1, 1, 2024));
    }

    @Test
    void testIsInvalidDate() {
        assertFalse(Date.isValidDate(30, 2, 2024));
    }

    ///

    @Test
    void testIsLeapYear() {
        assertTrue(Date.isLeapYear(2020));
    }

    @Test
    void testIsNotLeapYear() {
        assertFalse(Date.isLeapYear(2021));
    }

    ///

    @Test
    void testNextDate() {
        Date currentDate = new Date(31, 1, 2024);
        Date nextDate = currentDate.nextDate();
        assertEquals(new Date(1, 2, 2024), nextDate);
    }

    @Test
    void testPreviousDate() {
        Date currentDate = new Date(1, 2, 2024);
        Date previousDate = currentDate.previousDate();
        assertEquals(new Date(31, 1, 2024), previousDate);
    }

    ///

    @Test
    void testCompareToEqualDates() {
        Date date1 = new Date(1, 1, 2024);
        Date date2 = new Date(1, 1, 2024);
        assertEquals(0, date1.compareTo(date2));
    }

    @Test
    void testCompareToPosteriorDate() {
        Date date1 = new Date(2, 1, 2024);
        Date date2 = new Date(1, 1, 2024);
        assertTrue(date1.compareTo(date2) > 0);
    }

    @Test
    void testCompareToAnteriorDate() {
        Date date1 = new Date(1, 1, 2024);
        Date date2 = new Date(2, 1, 2024);
        assertTrue(date1.compareTo(date2) < 0);
    }

    @Test
    void testCompareToNull() {
        Date date1 = new Date(1, 1, 2024);
        assertThrows(NullPointerException.class, () -> date1.compareTo(null));
    }
    
}