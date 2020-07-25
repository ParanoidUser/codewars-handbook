import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class WalkerTest {
  @Test
  void sample() {
    assertArrayEquals(new int[] {15, 135, 49, 18}, Walker.solve(12, 20, 18, 45, 30, 60));
    assertArrayEquals(new int[] {12, 133, 18, 44}, Walker.solve(15, 15, 19, 50, 29, 55));
    assertArrayEquals(new int[] {20, 129, 41, 57}, Walker.solve(14, 25, 17, 41, 35, 59));
  }
}
