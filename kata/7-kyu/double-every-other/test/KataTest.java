import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 4, 3, 8}, Kata.doubleEveryOther(new int[]{1, 2, 3, 4}));
    assertArrayEquals(new int[]{1, 38, 6, 4, 12, -6}, Kata.doubleEveryOther(new int[]{1, 19, 6, 2, 12, -3}));
    assertArrayEquals(new int[]{-1000, 3306, 210, 0, 1}, Kata.doubleEveryOther(new int[]{-1000, 1653, 210, 0, 1}));
  }
}