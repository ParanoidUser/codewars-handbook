import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxSequenceTest {
  @Test
  void sample() {
    assertEquals(6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    assertEquals(0, Max.sequence(new int[]{}));
  }
}
