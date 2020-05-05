import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class EvenNumbersTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{2, 4, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2));
    assertArrayEquals(new int[]{3, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3));
    assertArrayEquals(new int[]{0, 4}, EvenNumbers.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4));
  }
}
