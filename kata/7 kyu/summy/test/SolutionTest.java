import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(6, Summation.summy("1 2 3"));
    assertEquals(10, Summation.summy("1 2 3 4"));
    assertEquals(15, Summation.summy("1 2 3 4 5"));
    assertEquals(20, Summation.summy("10 10"));
    assertEquals(0, Summation.summy("0 0"));
  }
}
