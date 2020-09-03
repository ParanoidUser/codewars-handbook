import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertArrayEquals(new int[] {1, 9, 6, 3, 0, 1, 1, 1, 1, 1}, Dinglemouse.paintLetterboxes(125, 132));
  }
}
