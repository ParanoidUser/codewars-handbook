import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 3}, Solution.extraPerfect(3));
    assertArrayEquals(new int[]{1, 3, 5}, Solution.extraPerfect(5));
    assertArrayEquals(new int[]{1, 3, 5, 7}, Solution.extraPerfect(8));
    assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27}, Solution.extraPerfect(28));
    assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39}, Solution.extraPerfect(39));
  }
}
