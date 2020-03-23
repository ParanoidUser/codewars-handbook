import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSquareTest {
  @Test
  public void test1() {
    assertEquals(8, Kata.findSquares(3, 2));
  }

  @Test
  public void test2() {
    assertEquals(20, Kata.findSquares(4, 3));
  }

  @Test
  public void test3() {
    assertEquals(100, Kata.findSquares(11, 4));
  }
}
