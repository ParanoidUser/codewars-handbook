import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, new Kata().multiply(2, 2));
    assertEquals(10, new Kata().multiply(5, 2));
    assertEquals(100, new Kata().multiply(100, 1));
    assertEquals(0, new Kata().multiply(0, 1000));
  }
}
