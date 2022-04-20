import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, NextNumber.nextInteger(0));
    assertEquals(2, NextNumber.nextInteger(1));
    assertEquals(31, NextNumber.nextInteger(20));
    assertEquals(222, NextNumber.nextInteger(100));
  }
}