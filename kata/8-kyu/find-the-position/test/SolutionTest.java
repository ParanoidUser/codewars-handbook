import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Position of alphabet: 1", Kata.position('a'));
    assertEquals("Position of alphabet: 26", Kata.position('z'));
    assertEquals("Position of alphabet: 5", Kata.position('e'));
  }
}
