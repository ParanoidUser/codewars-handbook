import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
    assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
    assertEquals(0, Positive.sum(new int[0]));
    assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
    assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
  }
}
