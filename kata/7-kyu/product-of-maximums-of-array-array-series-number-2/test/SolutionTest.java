import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(20, Solution.maxProduct(new int[]{4, 3, 5}, 2));
    assertEquals(720, Solution.maxProduct(new int[]{10, 8, 7, 9}, 3));
    assertEquals(288, Solution.maxProduct(new int[]{8, 6, 4, 6}, 3));
    assertEquals(9600, Solution.maxProduct(new int[]{10, 2, 3, 8, 1, 10, 4}, 5));
    assertEquals(247895375, Solution.maxProduct(new int[]{13, 12, -27, -302, 25, 37, 133, 155, -14}, 5));
    assertEquals(4, Solution.maxProduct(new int[]{-4, -27, -15, -6, -1}, 2));
    assertEquals(136, Solution.maxProduct(new int[]{-17, -8, -102, -309}, 2));
    assertEquals(-30, Solution.maxProduct(new int[]{10, 3, -27, -1}, 3));
    assertEquals(-253344, Solution.maxProduct(new int[]{14, 29, -28, 39, -16, -48}, 4));
  }
}
