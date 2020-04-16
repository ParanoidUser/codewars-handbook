import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test1() {
    assertEquals("same", Solution.meanVsMedian(new int[] {1, 1, 1}));
  }

  @Test
  public void test2() {
    assertEquals("mean", Solution.meanVsMedian(new int[] {1, 2, 37}));
  }

  @Test
  public void test3() {
    assertEquals("median", Solution.meanVsMedian(new int[] {7, 14, -70}));
  }
}
