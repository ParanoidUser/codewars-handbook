import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumArrayTest {
  @Test
  void sample() {
    assertEquals(0, SumArray.sum(new double[]{}), 1e-4);
    assertEquals(-2.398, SumArray.sum(new double[]{-2.398}), 1e-4);
    assertEquals(6, SumArray.sum(new double[]{1, 2, 3}), 1e-4);
    assertEquals(6.6, SumArray.sum(new double[]{1.1, 2.2, 3.3}), 1e-4);
    assertEquals(9.2, SumArray.sum(new double[]{1, 5.2, 4, 0, -1}), 1e-4);
    assertEquals(320, SumArray.sum(new double[]{30, 89, 100, 101}), 1e-4);
  }
}