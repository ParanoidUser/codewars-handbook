import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void exampleTest1() {
    assertEquals(100, MostDigits.findLongest(new int[] {1, 10, 100}));
  }

  @Test
  public void exampleTest2() {
    assertEquals(9000, MostDigits.findLongest(new int[] {9000, 8, 800}));
  }

  @Test
  public void exampleTest3() {
    assertEquals(900, MostDigits.findLongest(new int[] {8, 900, 500}));
  }

  @Test
  public void exampleTest4() {
    assertEquals(40000, MostDigits.findLongest(new int[] {3, 40000, 100}));
  }

  @Test
  public void exampleTest5() {
    assertEquals(100000, MostDigits.findLongest(new int[] {1, 200, 100000}));
  }

  @Test
  public void exampleTest6() {
    assertEquals(-10, MostDigits.findLongest(new int[] {-10, 1, 0, 1, 10}));
  }
}
