import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new int[] {6, 6}, CircleOfChildren.distributionOfCandy(new int[] {1, 2, 3, 4, 5}));
    assertArrayEquals(new int[] {17, 18}, CircleOfChildren.distributionOfCandy(new int[] {10, 2, 8, 22, 16, 4, 10, 6, 14, 20}));
  }
}
