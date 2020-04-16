import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void test() {
    assertEquals(5, Kata.pointsNumber(1));
    assertEquals(13, Kata.pointsNumber(2));
    assertEquals(29, Kata.pointsNumber(3));
    assertEquals(81, Kata.pointsNumber(5));
    assertEquals(3141549, Kata.pointsNumber(1000));
  }
}
