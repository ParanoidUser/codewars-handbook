import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(52, Kata.getCalendarWeek("2017-01-01"));
    assertEquals(52, Kata.getCalendarWeek("2018-12-24"));
    assertEquals(1, Kata.getCalendarWeek("2018-12-31"));
    assertEquals(1, Kata.getCalendarWeek("2019-01-01"));
    assertEquals(9, Kata.getCalendarWeek("2016-02-29"));
    assertEquals(53, Kata.getCalendarWeek("2015-12-29"));
  }
}
