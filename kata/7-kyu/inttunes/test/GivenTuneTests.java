import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GivenTuneTests {
  @Test
  void sample() {
    assertTrue(Kata.isTune(new int[] {1, 6, 3}));
    assertTrue(Kata.isTune(new int[] {1, 3, 6, 8, 10, 12}));
    assertTrue(Kata.isTune(new int[] {2, 4, 7, 9, 11, 13}));
    assertTrue(Kata.isTune(new int[] {1, 3, 6, 8, 10, 12, 13, 15}));
    assertFalse(Kata.isTune(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
    assertFalse(Kata.isTune(null));
  }
}
