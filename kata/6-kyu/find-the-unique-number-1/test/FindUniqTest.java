import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindUniqTest {
  @Test
  void sample() {
    assertEquals(0.0, Kata.findUniq(new double[] {0, 1, 1}), 10e-10);
    assertEquals(1.0, Kata.findUniq(new double[] {0, 1, 0}), 10e-10);
    assertEquals(2.0, Kata.findUniq(new double[] {1, 1, 1, 2, 1, 1}), 10e-10);
  }
}
