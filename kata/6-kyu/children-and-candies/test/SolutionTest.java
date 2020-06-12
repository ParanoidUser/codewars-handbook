import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{6, 6}, CircleOfChildren.distributionOfCandy(new int[]{1, 2, 3, 4, 5}));
    assertArrayEquals(new int[]{17, 18}, CircleOfChildren.distributionOfCandy(new int[]{10, 2, 8, 22, 16, 4, 10, 6, 14, 20}));
  }
}
