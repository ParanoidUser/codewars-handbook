import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{2, 3, 4, 5}, Kata.generateIntegers(2, 5));
  }
}