import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(5, Kata.pointsNumber(1));
    assertEquals(13, Kata.pointsNumber(2));
    assertEquals(29, Kata.pointsNumber(3));
    assertEquals(81, Kata.pointsNumber(5));
    assertEquals(3141549, Kata.pointsNumber(1000));
  }
}
