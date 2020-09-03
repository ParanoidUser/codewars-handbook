import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumOfElementsTest {
  @Test
  void sample() {
    assertEquals(2, Sid.sumOfElements(new int[][]{{1, 0}, {0, 1}}));
    assertEquals(45, Sid.sumOfElements(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    assertEquals(122, Sid.sumOfElements(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 2}}));
  }
}
