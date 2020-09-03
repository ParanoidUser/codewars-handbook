import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("no", Solution.isSortedAndHow(new int[]{4, 2, 30}));
    assertEquals("yes, ascending", Solution.isSortedAndHow(new int[] {1, 2}));
    assertEquals("yes, ascending", Solution.isSortedAndHow(new int[]{-9999, -9999}));
    assertEquals("yes, descending", Solution.isSortedAndHow(new int[] {15, 7, 3, -8}));
  }
}
