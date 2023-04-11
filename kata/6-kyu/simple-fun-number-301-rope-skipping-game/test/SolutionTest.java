import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(60, SkipRope.tiaosheng(new int[]{}));
    assertEquals(51, SkipRope.tiaosheng(new int[]{12, 23, 45}));
    assertEquals(57, SkipRope.tiaosheng(new int[]{17}));
    assertEquals(48, SkipRope.tiaosheng(new int[]{10, 20, 3, 40}));
    assertEquals(48, SkipRope.tiaosheng(new int[]{10, 20, 3, 40, 58}));
    assertEquals(47, SkipRope.tiaosheng(new int[]{10, 20, 3, 40, 47, 60}));
    assertEquals(30, SkipRope.tiaosheng(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    assertEquals(58, SkipRope.tiaosheng(new int[]{58}));
  }
}