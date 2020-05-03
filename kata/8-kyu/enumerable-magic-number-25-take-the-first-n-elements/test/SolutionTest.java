import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 1, 2}, ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    assertArrayEquals(new int[0], ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 0));
    assertArrayEquals(new int[]{0, 1, 13}, ZywOo.take(new int[]{0, 1, 13}, 10));
  }
}
