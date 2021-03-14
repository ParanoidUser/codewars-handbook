import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("January, 15", Kata.getDay(15, false));
    assertEquals("February, 10", Kata.getDay(41, false));
    assertEquals("February, 28", Kata.getDay(59, false));
    assertEquals("February, 29", Kata.getDay(60, true));
    assertEquals("March, 1", Kata.getDay(60, false));
    assertEquals("April, 18", Kata.getDay(108, false));
    assertEquals("May, 9", Kata.getDay(130, true));
    assertEquals("June, 25", Kata.getDay(176, false));
    assertEquals("July, 6", Kata.getDay(187, false));
    assertEquals("August, 1", Kata.getDay(214, true));
    assertEquals("September, 24", Kata.getDay(267, false));
    assertEquals("December, 1", Kata.getDay(335, false));
    assertEquals("December, 31", Kata.getDay(365, false));
    assertEquals("December, 31", Kata.getDay(366, true));
  }
}
