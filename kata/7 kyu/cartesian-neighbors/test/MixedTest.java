import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MixedTest {
  @Test
  public void exampleTest() {
    assertArrayEquals(new int[][] {{1, 1}, {1, 2}, {1, 3}, {2, 1}, {2, 3}, {3, 1}, {3, 2}, {3, 3}}, Kata.cartesianNeighbor(2, 2));
  }
}
