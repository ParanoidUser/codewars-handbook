import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 2}, Solution.twoSum(new int[]{1, 2, 3}, 4));
    assertArrayEquals(new int[]{1, 2}, Solution.twoSum(new int[]{1234, 5678, 9012}, 14690));
    assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 2, 3}, 4));
    assertArrayEquals(new int[0], Solution.twoSum(new int[]{1, 1, 1}, 3));
    assertArrayEquals(new int[0], Solution.twoSum(new int[0], 3));
  }
}
