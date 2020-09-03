import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SortByBinaryOnesTest {
  @Test
  void sample() {
    assertArrayEquals(new Integer[]{3, 1}, new SortByBinaryOnes().sort(new Integer[]{1, 3}));
    assertArrayEquals(new Integer[]{3, 1, 2, 4}, new SortByBinaryOnes().sort(new Integer[]{1, 2, 3, 4}));
    assertArrayEquals(new Integer[]{15, 7, 3, 5, 1}, new SortByBinaryOnes().sort(new Integer[] {1, 15, 5, 7, 3}));
  }
}
