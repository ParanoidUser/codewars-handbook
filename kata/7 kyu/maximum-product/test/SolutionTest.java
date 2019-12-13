import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void fixedTests() {
    assertEquals(40, MaxProduct.adjacentElementsProduct(new int[] {5, 8}));
    assertEquals(6, MaxProduct.adjacentElementsProduct(new int[] {1, 2, 3}));
    assertEquals(90, MaxProduct.adjacentElementsProduct(new int[] {1, 5, 10, 9}));
    assertEquals(48, MaxProduct.adjacentElementsProduct(new int[] {4, 12, 3, 1, 5}));
    assertEquals(6, MaxProduct.adjacentElementsProduct(new int[] {5, 1, 2, 3, 1, 4}));

    assertEquals(21, MaxProduct.adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
    assertEquals(50, MaxProduct.adjacentElementsProduct(new int[] {9, 5, 10, 2, 24, -1, -48}));
    assertEquals(30, MaxProduct.adjacentElementsProduct(new int[] {5, 6, -4, 2, 3, 2, -23}));
    assertEquals(-14, MaxProduct.adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}));
    assertEquals(6, MaxProduct.adjacentElementsProduct(new int[] {5, 1, 2, 3, 1, 4}));

    assertEquals(0, MaxProduct.adjacentElementsProduct(new int[] {1, 0, 1, 0, 1000}));
    assertEquals(6, MaxProduct.adjacentElementsProduct(new int[] {1, 2, 3, 0}));
  }
}
