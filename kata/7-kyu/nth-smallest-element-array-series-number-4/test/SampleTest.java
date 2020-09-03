import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(2, Kata.nthSmallest(new int[]{3, 1, 2}, 2));
    assertEquals(7, Kata.nthSmallest(new int[]{15, 20, 7, 10, 4, 3}, 3));
    assertEquals(-1, Kata.nthSmallest(new int[]{-5, -1, -6, -18}, 4));
    assertEquals(2, Kata.nthSmallest(new int[]{2, 169, 13, -5, 0, -1}, 4));
    assertEquals(-2, Kata.nthSmallest(new int[]{-102, -16, -1, -2, -367, -9}, 5));
    assertEquals(92, Kata.nthSmallest(new int[]{177, 225, 243, -169, -12, -5, 2, 92}, 5));
  }
}
