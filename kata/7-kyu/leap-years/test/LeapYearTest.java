import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearTest {
  @Test
  void sample() {
    assertTrue(LeapYears.isLeapYear(2020));
    assertTrue(LeapYears.isLeapYear(2000));
    assertFalse(LeapYears.isLeapYear(2015));
    assertFalse(LeapYears.isLeapYear(2100));
  }
}