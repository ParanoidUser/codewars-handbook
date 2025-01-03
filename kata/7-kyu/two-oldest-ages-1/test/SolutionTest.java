import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{45, 87}, Kata.twoOldestAges(new int[]{1, 5, 87, 45, 8, 8}));
    assertArrayEquals(new int[]{18, 83}, Kata.twoOldestAges(new int[]{6, 5, 83, 5, 3, 18}));
  }
}