import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThinkingAndTestingTest {
  @Test
  void sample() {
    assertEquals(0, ThinkingAndTesting.testTrueFalse(0));
    assertEquals(1, ThinkingAndTesting.testTrueFalse(1));
    assertEquals(1, ThinkingAndTesting.testTrueFalse(2));
    assertEquals(2, ThinkingAndTesting.testTrueFalse(3));
    assertEquals(1, ThinkingAndTesting.testTrueFalse(4));
    assertEquals(2, ThinkingAndTesting.testTrueFalse(5));
    assertEquals(2, ThinkingAndTesting.testTrueFalse(6));
    assertEquals(3, ThinkingAndTesting.testTrueFalse(7));
    assertEquals(1, ThinkingAndTesting.testTrueFalse(8));
    assertEquals(2, ThinkingAndTesting.testTrueFalse(9));
    assertEquals(2, ThinkingAndTesting.testTrueFalse(10));
    assertEquals(3, ThinkingAndTesting.testTrueFalse(100));
    assertEquals(6, ThinkingAndTesting.testTrueFalse(1000));
    assertEquals(5, ThinkingAndTesting.testTrueFalse(10000));
  }
}
