import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfElementsTest {
  @Test
  public void test1() {
    int[][] a = {{1, 0}, {0, 1}};
    assertEquals(2, Sid.sumOfElements(a));
    int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    assertEquals(45, Sid.sumOfElements(b));
    int[][] c = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 2}};
    assertEquals(122, Sid.sumOfElements(c));
  }
}
