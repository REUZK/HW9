import main.Calendar;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TestCalendar {

    @ParameterizedTest
    @ValueSource(ints = {1908, 1912, 1916, 1920, 1924})
    public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        Calendar calendar = new Calendar(year);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        if (gregorianCalendar.isLeapYear(year)) {
            assertTrue(calendar.isLeapYear());
        } else {
            assertFalse(calendar.isLeapYear());
        }

    }

    @ParameterizedTest
    @ValueSource(ints = {1907, 1909, 1910, 1921, 1923})
    public void Should_return_false(int year) {
        Calendar calendar = new Calendar(year);
        assertFalse(calendar.isLeapYear());

    }

    @ParameterizedTest
    @ValueSource(ints = {1940, 1944, 1948, 1952, 1956})
    public void Should_return_true(int year) {
        Calendar calendar = new Calendar(year);
        assertTrue(calendar.isLeapYear());

    }

    @ParameterizedTest
    @ValueSource(ints = {1908, 1909, 1910, 1911, 1912})
    public void Should_return_if_year_is_leap(int year) {
        Calendar calendar = new Calendar(year);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        if (gregorianCalendar.isLeapYear(year)) {
            assertTrue(calendar.isLeapYear());
        } else {
            assertFalse(calendar.isLeapYear());
        }

    }

}
