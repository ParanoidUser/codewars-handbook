import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(256, Kata.nextHigher(128));
    assertEquals(2, Kata.nextHigher(1));
    assertEquals(1279, Kata.nextHigher(1022));
    assertEquals(191, Kata.nextHigher(127));
    assertEquals(1253359, Kata.nextHigher(1253343));
  }
}
