import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void fixedTests() {
    assertEquals(1, new Sum().sum(1));
    assertEquals(36, new Sum().sum(8));
    assertEquals(253, new Sum().sum(22));
    assertEquals(5050, new Sum().sum(100));
    assertEquals(22791, new Sum().sum(213));
  }
}
