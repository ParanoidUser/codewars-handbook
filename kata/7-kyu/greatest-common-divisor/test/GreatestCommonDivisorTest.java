import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {
  @Test
  void sample() {
    assertEquals(6, GCD.compute(30, 12));
    assertEquals(1, GCD.compute(8, 9));
    assertEquals(1, GCD.compute(1, 1));
  }
}
