import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(7, Kata.oddCount(15));
    assertEquals(7511, Kata.oddCount(15023));
  }
}
