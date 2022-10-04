import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, Kata.countBy(1, 10));
    assertArrayEquals(new int[]{2, 4, 6, 8, 10}, Kata.countBy(2, 5));
    assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 21}, Kata.countBy(3, 7));
    assertArrayEquals(new int[]{50, 100, 150, 200, 250}, Kata.countBy(50, 5));
    assertArrayEquals(new int[]{100, 200, 300, 400, 500, 600}, Kata.countBy(100, 6));
  }
}
