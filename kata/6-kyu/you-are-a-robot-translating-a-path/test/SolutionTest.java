import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Take 1 step up", Solution.walk("^"));
    assertEquals("Take 1 step down", Solution.walk("v"));
    assertEquals("Take 2 steps right", Solution.walk(">>"));
    assertEquals("Take 2 steps left\nTake 1 step right", Solution.walk("<<>"));
    assertEquals("Paused", Solution.walk(""));
  }
}
