import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[] {1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9}, JomoPipi.sequence(16));
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, JomoPipi.sequence(9));
  }
}
