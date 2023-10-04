import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{20, 12, 18, 30, 21}, Solution.encode("scout", 1939));
    assertArrayEquals(new int[]{14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8}, Solution.encode("masterpiece", 1939));
  }
}