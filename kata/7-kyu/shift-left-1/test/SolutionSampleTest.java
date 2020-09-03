import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionSampleTest {
  @Test
  void sample() {
    assertEquals(2, Solution.shiftLeft("test", "west"));
    assertEquals(7, Solution.shiftLeft("test", "yes"));
    assertEquals(1, Solution.shiftLeft("b", "ab"));
    assertEquals(0, Solution.shiftLeft("", ""));
  }
}
