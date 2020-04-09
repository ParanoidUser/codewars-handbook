import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SnailTest {
  @Test
  void snailTest1() {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, Snail.snail(array));
  }
}
