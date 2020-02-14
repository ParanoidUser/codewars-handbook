import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {
  @Test
  public void basicTests() {
    //assertArrayEquals(new int[] {0, 2}, Solution.twoSum(new int[] {1, 2, 3}, 4));
    //assertArrayEquals(new int[] {1, 2}, Solution.twoSum(new int[] {1234, 5678, 9012}, 14690));
    assertArrayEquals(new int[] {0, 1}, Solution.twoSum(new int[] {2, 2, 3}, 4));
  }
}
