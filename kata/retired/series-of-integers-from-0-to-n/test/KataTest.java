import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0}, Kata.generateIntegers(0));
    assertArrayEquals(new int[]{0, 1, 2, 3}, Kata.generateIntegers(3));
  }
}