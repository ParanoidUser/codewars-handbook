import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 2, 3}, OrArrays.orArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    assertArrayEquals(new int[]{5, 7, 7}, OrArrays.orArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    assertArrayEquals(new int[]{1, 2, 3}, OrArrays.orArrays(new int[]{1, 2, 3}, new int[]{1, 2}));
    assertArrayEquals(new int[]{1, 2, 3}, OrArrays.orArrays(new int[]{1, 0}, new int[]{1, 2, 3}));
    assertArrayEquals(new int[]{1, 2, 3}, OrArrays.orArrays(new int[]{1, 0, 3}, new int[]{1, 2, 3}, 3));
  }
}
