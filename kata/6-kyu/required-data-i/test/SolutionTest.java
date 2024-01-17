import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new Object[]{10, 7, 5, new Object[]{new int[]{-5}, 3}},
        Solution.countSel(new int[]{-3, -2, -1, 3, 4, -5, -5, 5, -1, -5}));
    assertArrayEquals(new Object[]{10, 7, 4, new Object[]{new int[]{-2, -1, 5}, 2}},
        Solution.countSel(new int[]{5, -1, 1, -1, -2, 5, 0, -2, -5, 3}));
    assertArrayEquals(new Object[]{10, 6, 3, new Object[]{new int[]{-2}, 3}},
        Solution.countSel(new int[]{-2, 4, 4, -2, -2, -1, 3, 5, -5, 5}));
    assertArrayEquals(new Object[]{10, 5, 1, new Object[]{new int[]{4}, 3}},
        Solution.countSel(new int[]{4, -5, 1, -5, 2, 4, -1, 4, -1, 1}));
    assertArrayEquals(new Object[]{14, 8, 4, new Object[]{new int[]{2, 4}, 3}},
        Solution.countSel(new int[]{4, 4, 2, -3, 1, 4, 3, 2, 0, -5, 2, -2, -2, -5}));
  }
}