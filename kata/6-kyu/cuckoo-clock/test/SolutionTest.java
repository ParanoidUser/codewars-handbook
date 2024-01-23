import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("07:30", CuckooClock.cuckooClock("07:22", 1));
    assertEquals("12:45", CuckooClock.cuckooClock("12:22", 2));
    assertEquals("01:45", CuckooClock.cuckooClock("01:30", 2));
    assertEquals("05:30", CuckooClock.cuckooClock("04:01", 10));
    assertEquals("06:00", CuckooClock.cuckooClock("03:38", 19));

    assertEquals("10:00", CuckooClock.cuckooClock("10:00", 1));
    assertEquals("10:00", CuckooClock.cuckooClock("10:00", 10));
    assertEquals("10:15", CuckooClock.cuckooClock("10:00", 11));
    assertEquals("10:45", CuckooClock.cuckooClock("10:00", 13));
    assertEquals("11:00", CuckooClock.cuckooClock("10:00", 20));

    assertEquals("12:30", CuckooClock.cuckooClock("12:30", 1));
    assertEquals("12:45", CuckooClock.cuckooClock("12:30", 2));
    assertEquals("01:00", CuckooClock.cuckooClock("12:30", 3));
    assertEquals("01:15", CuckooClock.cuckooClock("12:30", 4));
    assertEquals("02:30", CuckooClock.cuckooClock("09:53", 50));

    assertEquals("08:00", CuckooClock.cuckooClock("08:17", 113));
    assertEquals("08:15", CuckooClock.cuckooClock("08:17", 114));
    assertEquals("08:30", CuckooClock.cuckooClock("08:17", 115));
    assertEquals("11:00", CuckooClock.cuckooClock("08:17", 150));
    assertEquals("05:45", CuckooClock.cuckooClock("08:17", 200));
  }
}