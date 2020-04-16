import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThinkingAndTestingTest {
  @Test
  public void exampleSumTests() {
    assertEquals(1, ThinkingAndTesting.testAB(0, 1));
    assertEquals(3, ThinkingAndTesting.testAB(1, 2));
    assertEquals(30, ThinkingAndTesting.testAB(10, 20));
  }

  @Test
  public void exampleProductTests() {
    assertEquals(1, ThinkingAndTesting.testAB(1, 1));
    assertEquals(3, ThinkingAndTesting.testAB(1, 3));
  }
}
