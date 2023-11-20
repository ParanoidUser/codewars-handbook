import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiagonalProductTest {
  @Test
  void sample() {
    assertEquals(1, DiagonalProduct.ReturnProduct(new int[][]{{1, 0}, {0, 1}}));
    assertEquals(45, DiagonalProduct.ReturnProduct(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    assertEquals(132, DiagonalProduct.ReturnProduct(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 2}}));
  }
}