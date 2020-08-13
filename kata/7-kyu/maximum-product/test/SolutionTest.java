import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(40, new MaxProduct().adjacentElementsProduct(new int[]{5, 8}));
    assertEquals(6, new MaxProduct().adjacentElementsProduct(new int[]{1, 2, 3}));
    assertEquals(90, new MaxProduct().adjacentElementsProduct(new int[]{1, 5, 10, 9}));
    assertEquals(48, new MaxProduct().adjacentElementsProduct(new int[]{4, 12, 3, 1, 5}));
    assertEquals(6, new MaxProduct().adjacentElementsProduct(new int[]{5, 1, 2, 3, 1, 4}));
    assertEquals(21, new MaxProduct().adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3}));
    assertEquals(50, new MaxProduct().adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
    assertEquals(30, new MaxProduct().adjacentElementsProduct(new int[]{5, 6, -4, 2, 3, 2, -23}));
    assertEquals(-14, new MaxProduct().adjacentElementsProduct(new int[]{-23, 4, -5, 99, -27, 329, -2, 7, -921}));
    assertEquals(6, new MaxProduct().adjacentElementsProduct(new int[]{5, 1, 2, 3, 1, 4}));
    assertEquals(0, new MaxProduct().adjacentElementsProduct(new int[]{1, 0, 1, 0, 1000}));
    assertEquals(6, new MaxProduct().adjacentElementsProduct(new int[]{1, 2, 3, 0}));
  }
}
