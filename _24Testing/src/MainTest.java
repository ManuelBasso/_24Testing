import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
        private final Main testing = new Main();

    @Test
    void obtainYear_with_2011() {
        int result = testing.obtainYear(OffsetDateTime.parse("2111-04-01T13:00:00Z"));
        assertEquals(2111, result);
    }
    @Test
    void obtainYear_with_1000() {
        int result = testing.obtainYear(OffsetDateTime.parse("1000-04-01T13:00:00Z"));
        assertEquals(1000, result);
    }
    @Test
    void obtainYear_with_null() {
        Integer result = testing.obtainYear(null);
        assertNull(result);
    }

    @Test
    void obtainMonth_with_april() {
        String result = testing.obtainMonth(OffsetDateTime.parse("2111-04-01T13:00:00Z"));
        assertEquals("APRIL", result);
    }

    @Test
    void obtainMonth_with_null() {
        String result = testing.obtainMonth(null);
        assertNull(result);
    }

    @Test
    void obtainDay_with_day22() {
        Integer result = testing.obtainDay(OffsetDateTime.parse("2111-04-22T13:00:00Z"));
        assertEquals(22, result);
    }

    @Test
    void obtainDay_with_null() {
        Integer result = testing.obtainDay(null);
        assertNull(result);
    }
    @Test
    void obtainDayOfTheWeek_with_wednesday() {
        String result = testing.obtainDayOfTheWeek(OffsetDateTime.parse("2111-04-22T13:00:00Z"));
        assertEquals("WEDNESDAY", result);
    }

    @Test
    void obtainDayOfTheWeek_with_null() {
        String result = testing.obtainDayOfTheWeek(null);
        assertNull(result);
    }

}