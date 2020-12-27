import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("ybzc", Solution.solve("xyab", "xzca"));
    assertEquals("ybbzc", Solution.solve("xyabb", "xzca"));
    assertEquals("abcdxyz", Solution.solve("abcd", "xyz"));
    assertEquals("zca", Solution.solve("xxx", "xzca"));
  }
}