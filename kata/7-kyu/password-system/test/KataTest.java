import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("Yes", Kata.helpZoom(new int[] {1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1}));
    assertEquals("No", Kata.helpZoom(new int[] {1, 1, 0, 0, 0, 0, 1, 1, 0}));
  }
}
