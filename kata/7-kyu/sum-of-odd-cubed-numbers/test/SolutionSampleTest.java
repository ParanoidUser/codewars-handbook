import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionSampleTest {
  @Test
  void sample() {
    assertEquals(0, FindOddCubes.cubeOdd(new int[] {-5, -5, 5, 5}));
    assertEquals(28, FindOddCubes.cubeOdd(new int[] {1, 2, 3, 4}));
    assertEquals(0, FindOddCubes.cubeOdd(new int[] {-3, -2, 2, 3}));
  }
}
