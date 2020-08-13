import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThinkingAndTestingTest {
  @Test
  void sample() {
    assertEquals(1, ThinkingAndTesting.testAB(0, 1));
    assertEquals(1, ThinkingAndTesting.testAB(1, 1));
    assertEquals(3, ThinkingAndTesting.testAB(1, 2));
    assertEquals(3, ThinkingAndTesting.testAB(1, 3));
    assertEquals(30, ThinkingAndTesting.testAB(10, 20));
  }
}
