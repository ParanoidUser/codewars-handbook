import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    long elapsed = System.currentTimeMillis() + 7000;
    Kata.makeMeSlow();
    assertTrue(System.currentTimeMillis() > elapsed);
  }
}