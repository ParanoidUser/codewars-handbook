import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DigitizeExampleTests {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Kata.digitize(35231));
  }
}
