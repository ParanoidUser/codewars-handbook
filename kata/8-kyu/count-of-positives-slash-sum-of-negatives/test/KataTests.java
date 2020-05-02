import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertArrayEquals(new int[]{10, -65}, Kata.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    assertArrayEquals(new int[]{8, -50}, Kata.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    assertArrayEquals(new int[0], Kata.countPositivesSumNegatives(null));
    assertArrayEquals(new int[0], Kata.countPositivesSumNegatives(new int[0]));
  }
}
