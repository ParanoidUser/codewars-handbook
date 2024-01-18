import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(-1, Kata.beginning(""));
    assertEquals(1, Kata.beginning("123456789101112131415"));
    assertEquals(9, Kata.beginning("91011"));
    assertEquals(11, Kata.beginning("1112"));
    assertEquals(17, Kata.beginning("17181920"));
    assertEquals(99, Kata.beginning("99100"));
    assertEquals(72637236, Kata.beginning("72637236"));
  }
}