import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTest() {
    assertEquals(4, Kata.multiply(2, 2));
    assertEquals(10, Kata.multiply(5, 2));
    assertEquals(100, Kata.multiply(100, 1));
    assertEquals(0, Kata.multiply(0, 1000));
  }
}
