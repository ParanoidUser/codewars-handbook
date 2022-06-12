import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MaxConsecutiveSumTest {
  @Test
  void sample() {
    assertArrayEquals(new int[0], MaxConsecutiveSum.maxConsecutiveSum(-1));
    assertArrayEquals(new int[0], MaxConsecutiveSum.maxConsecutiveSum(0));
    assertArrayEquals(new int[0], MaxConsecutiveSum.maxConsecutiveSum(1));
    assertArrayEquals(new int[0], MaxConsecutiveSum.maxConsecutiveSum(2));
    assertArrayEquals(new int[0], MaxConsecutiveSum.maxConsecutiveSum(1024));
    assertArrayEquals(new int[0], MaxConsecutiveSum.maxConsecutiveSum(1073741824));
    assertArrayEquals(new int[]{1, 2}, MaxConsecutiveSum.maxConsecutiveSum(3));
    assertArrayEquals(new int[]{2, 3}, MaxConsecutiveSum.maxConsecutiveSum(5));
    assertArrayEquals(new int[]{495, 496}, MaxConsecutiveSum.maxConsecutiveSum(991));
    assertArrayEquals(new int[]{2, 9}, MaxConsecutiveSum.maxConsecutiveSum(44));
    assertArrayEquals(new int[]{1, 9}, MaxConsecutiveSum.maxConsecutiveSum(45));
    assertArrayEquals(new int[]{9, 16}, MaxConsecutiveSum.maxConsecutiveSum(100));
    assertArrayEquals(new int[]{8, 20}, MaxConsecutiveSum.maxConsecutiveSum(182));
    assertArrayEquals(new int[]{3, 19}, MaxConsecutiveSum.maxConsecutiveSum(187));
    assertArrayEquals(new int[]{1, 5511}, MaxConsecutiveSum.maxConsecutiveSum(15188316));
    assertArrayEquals(new int[]{1530868, 1530871}, MaxConsecutiveSum.maxConsecutiveSum(6123478));
    assertArrayEquals(new int[]{1073741823, 1073741824}, MaxConsecutiveSum.maxConsecutiveSum(Integer.MAX_VALUE));
  }
}