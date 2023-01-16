import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(40900.3, new Eratosthenes().circumference(8.1, 1.0, 800), 0.1);
    assertEquals(91.4, new Eratosthenes().circumference(1, 5, 20), 0.1);
    assertEquals(263.8, new Eratosthenes().circumference(2, 5, 50), 0.1);
  }
}