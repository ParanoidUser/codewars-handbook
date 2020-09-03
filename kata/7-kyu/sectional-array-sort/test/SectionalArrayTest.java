import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SectionalArrayTest {
  @Test
  void sample() {
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, SectionalArray.sort(new int[] {1, 2, 5, 7, 4, 6, 3, 9, 8}, 2));
    assertArrayEquals(new int[] {1, 2, 5, 7, 4, 6, 3, 9, 8}, SectionalArray.sort(new int[] {1, 2, 5, 7, 4, 6, 3, 9, 8}, 8));
    assertArrayEquals(new int[] {9, 7, 1, 2, 3, 4, 5, 8, 6}, SectionalArray.sort(new int[] {9, 7, 4, 2, 5, 3, 1, 8, 6}, 2, 5));
    assertArrayEquals(new int[] {1, 2, 5, 7, 4, 6, 3, 9, 8}, SectionalArray.sort(new int[] {1, 2, 5, 7, 4, 6, 3, 9, 8}, 8, 3));
    assertArrayEquals(new int[] {}, SectionalArray.sort(new int[] {}, 0));
  }
}
