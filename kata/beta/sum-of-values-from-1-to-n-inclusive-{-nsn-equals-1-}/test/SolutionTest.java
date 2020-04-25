import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void fixedTests() {
    assertEquals(1, Sum.sum(1));
    assertEquals(36, Sum.sum(8));
    assertEquals(253, Sum.sum(22));
    assertEquals(5050, Sum.sum(100));
    assertEquals(22791, Sum.sum(213));
  }
}
