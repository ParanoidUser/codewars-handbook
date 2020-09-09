import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(23, Solution.solve("123", 1));
    assertEquals(1234, Solution.solve("1234", 0));
    assertEquals(234, Solution.solve("1234", 1));
    assertEquals(34, Solution.solve("1234", 2));
    assertEquals(4, Solution.solve("1234", 3));
    assertEquals(0, Solution.solve("1234", -1));
  }
}
