import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class UniqueArrayTest {
  @Test
  void sample() {
    assertArrayEquals(new int[0], UniqueArray.unique(new int[0]));
    assertArrayEquals(new int[] {-1}, UniqueArray.unique(new int[] {-1}));
    assertArrayEquals(new int[] {1, 2, 3}, UniqueArray.unique(new int[] {1, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2}));
    assertArrayEquals(new int[] {1, 3, 2}, UniqueArray.unique(new int[] {1, 3, 2, 3, 2, 1, 2, 3, 1, 1, 3, 2}));
    assertArrayEquals(new int[] {3, 2, 1}, UniqueArray.unique(new int[] {3, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2}));
    assertArrayEquals(new int[] {-1, 5, 10, -100, 3, 2}, UniqueArray.unique(new int[] {-1, 5, 10, -100, 3, 2}));
  }
}
