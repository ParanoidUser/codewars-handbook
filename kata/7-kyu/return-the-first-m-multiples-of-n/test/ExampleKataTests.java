import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleKataTests {
  @Test
  void sample() {
    assertArrayEquals(new int[] {5, 10, 15}, Kata.multiples(3, 5));
  }
}
