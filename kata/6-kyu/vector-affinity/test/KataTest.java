import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
  @Test
  void sample() {
    assertEquals(1., Kata.vectorAffinity(new int[0], new int[0]));
    assertEquals(1., Kata.vectorAffinity(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    assertEquals(.6, Kata.vectorAffinity(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 2, 4, 3}));
    assertEquals(.6, Kata.vectorAffinity(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4, 5}));
    assertEquals(.75, Kata.vectorAffinity(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 5}));
    assertEquals(.16666666666666666, Kata.vectorAffinity(new int[]{6, 6, 6, 6, 6, 6}, new int[]{6}));
  }
}