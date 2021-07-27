import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("1-0", Solution.findSquares(1));
    assertEquals("25-16", Solution.findSquares(9));
    assertEquals("891136-889249", Solution.findSquares(1887));
    assertEquals("2499600016-2499500025", Solution.findSquares(99991));
  }
}