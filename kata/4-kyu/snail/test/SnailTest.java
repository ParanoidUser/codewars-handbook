import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SnailTest {
  @Test
  void snailTest0() {
    assertArrayEquals(new int[0], Snail.snail(new int[1][0]));
  }

  @Test
  void snailTest1() {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, Snail.snail(array));
  }

  @Test
  void snailTest2() {
    int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}, Snail.snail(array));
  }
}
