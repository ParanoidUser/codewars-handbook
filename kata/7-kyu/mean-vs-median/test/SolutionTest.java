import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("same", Solution.meanVsMedian(new int[] {1, 1, 1}));
    assertEquals("mean", Solution.meanVsMedian(new int[] {1, 2, 37}));
    assertEquals("median", Solution.meanVsMedian(new int[] {7, 14, -70}));
  }
}
