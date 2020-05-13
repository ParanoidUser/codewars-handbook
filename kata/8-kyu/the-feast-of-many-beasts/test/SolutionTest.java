import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.feast("great blue heron", "garlic nann"));
    assertTrue(Kata.feast("chickadee", "chocolate cake"));
    assertFalse(Kata.feast("brown bear", "bear claw"));
    assertFalse(Kata.feast("brown bear", "polar bear"));
    assertFalse(Kata.feast("brown bear", "chocolate cake"));
  }
}
