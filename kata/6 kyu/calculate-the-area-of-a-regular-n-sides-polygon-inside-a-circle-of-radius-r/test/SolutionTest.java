import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test1() {
    assertEquals(11.691, Kata.areaOfPolygonInsideCircle(3, 3), 1e-4);
  }

  @Test
  public void test2() {
    assertEquals(8, Kata.areaOfPolygonInsideCircle(2, 4), 1e-4);
  }

  @Test
  public void test3() {
    assertEquals(14.86, Kata.areaOfPolygonInsideCircle(2.5, 5), 1e-4);
  }
}
