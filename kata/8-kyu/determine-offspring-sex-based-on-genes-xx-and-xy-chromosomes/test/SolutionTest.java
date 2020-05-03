import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Congratulations! You're going to have a son.", Kata.chromosomeCheck("XY"));
    assertEquals("Congratulations! You're going to have a daughter.", Kata.chromosomeCheck("XX"));
  }
}
