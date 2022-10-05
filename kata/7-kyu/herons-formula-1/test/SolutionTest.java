import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void sample() {
    assertEquals(6, Kata.heron(3, 4, 5));
    assertEquals(24, Kata.heron(6, 8, 10));
  }
}

