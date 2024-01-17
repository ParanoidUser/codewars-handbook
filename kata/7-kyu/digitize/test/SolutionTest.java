import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0}, Solution.digitize(0));
    assertArrayEquals(new int[]{1}, Solution.digitize(1));
    assertArrayEquals(new int[]{1, 2, 3}, Solution.digitize(123));
    assertArrayEquals(new int[]{1, 2, 3, 0}, Solution.digitize(1230));
    assertArrayEquals(new int[]{8, 6, 7, 5, 3, 0, 9}, Solution.digitize(8675309));
  }
}