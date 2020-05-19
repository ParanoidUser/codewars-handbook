import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Kata.lastFibDigit(1));
    assertEquals(6, Kata.lastFibDigit(21));
    assertEquals(1, Kata.lastFibDigit(302));
    assertEquals(7, Kata.lastFibDigit(4003));
    assertEquals(8, Kata.lastFibDigit(50004));
    assertEquals(5, Kata.lastFibDigit(600005));
    assertEquals(3, Kata.lastFibDigit(7000006));
    assertEquals(8, Kata.lastFibDigit(80000007));
    assertEquals(1, Kata.lastFibDigit(900000008));
    assertEquals(9, Kata.lastFibDigit(1000000009));
  }
}