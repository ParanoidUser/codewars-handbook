import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1L, Factorial.factorial(0));
    assertEquals(1L, Factorial.factorial(1));
    assertEquals(24L, Factorial.factorial(4));
    assertEquals(5040L, Factorial.factorial(7));
  }
}
