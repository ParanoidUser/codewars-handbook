import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 3, 5, 7, 9}, Kata.kidoCount(10));
    assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11}, Kata.kidoCount(11));
  }
}
