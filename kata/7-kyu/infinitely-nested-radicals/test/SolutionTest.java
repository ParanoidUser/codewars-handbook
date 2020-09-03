import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(2.0, JomoPipi.evaluateFunction(2), 0.000000001);
    assertEquals(3.0, JomoPipi.evaluateFunction(6), 0.000000001);
    assertEquals(4.0, JomoPipi.evaluateFunction(12), 0.000000001);
  }
}
