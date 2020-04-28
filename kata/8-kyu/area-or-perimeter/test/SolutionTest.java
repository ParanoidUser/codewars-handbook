import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(32, Solution.areaOrPerimeter(6, 10));
    assertEquals(64, Solution.areaOrPerimeter(8, 8));
  }
}
