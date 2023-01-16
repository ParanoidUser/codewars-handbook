import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertFalse(Kata.hasTwoCubeSums(1));
    assertTrue(Kata.hasTwoCubeSums(1729));
    assertFalse(Kata.hasTwoCubeSums(42));
    assertTrue(Kata.hasTwoCubeSums(4104));
    assertFalse(Kata.hasTwoCubeSums(4105));
  }
}