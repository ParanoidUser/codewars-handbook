import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 0, 0}, Solution.withdraw(0));
    assertArrayEquals(new int[]{0, 0, 2}, Solution.withdraw(40));
    assertArrayEquals(new int[]{0, 1, 0}, Solution.withdraw(50));
    assertArrayEquals(new int[]{0, 0, 3}, Solution.withdraw(60));
    assertArrayEquals(new int[]{1, 1, 4}, Solution.withdraw(230));
    assertArrayEquals(new int[]{2, 1, 0}, Solution.withdraw(250));
    assertArrayEquals(new int[]{2, 0, 3}, Solution.withdraw(260));
  }
}