import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(840, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][] {{15, 18}, {4, 5}, {12, 60}}));
    assertEquals(1092, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][] {{1, 1}, {0, 0}, {13, 91}}));
    assertEquals(0, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][] {{15, 7}, {4, 5}, {19, 60}}));
    assertEquals(1890, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][] {{20, 50}, {10, 10}, {50, 20}}));
    assertEquals(0, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][] {}));
  }
}
