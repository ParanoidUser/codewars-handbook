import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{2, 3, 4, 5}, Remover.removeSmallest(new int[]{1, 2, 3, 4, 5}));
    assertArrayEquals(new int[]{5, 3, 2, 4}, Remover.removeSmallest(new int[]{5, 3, 2, 1, 4}));
    assertArrayEquals(new int[]{2, 2, 2, 1}, Remover.removeSmallest(new int[]{2, 2, 1, 2, 1}));
    assertArrayEquals(new int[]{5, 3, 2, 4}, Remover.removeSmallest(new int[]{5, 3, 2, 1, 4}));
    assertArrayEquals(new int[]{5, 4, 3, 2}, Remover.removeSmallest(new int[]{5, 4, 3, 2, 1}));
  }
}