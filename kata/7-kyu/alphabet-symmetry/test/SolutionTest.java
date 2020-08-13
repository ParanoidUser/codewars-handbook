import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{4, 3, 1}, Solution.solve(new String[]{"abode", "ABc", "xyzD"}));
    assertArrayEquals(new int[]{4, 3, 0}, Solution.solve(new String[]{"abide", "ABc", "xyz"}));
    assertArrayEquals(new int[]{6, 5, 7}, Solution.solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}));
    assertArrayEquals(new int[]{1, 3, 1, 3}, Solution.solve(new String[]{"encode", "abc", "xyzD", "ABmD"}));
  }
}
