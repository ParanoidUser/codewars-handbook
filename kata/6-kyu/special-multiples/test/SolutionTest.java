import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(16, CountMultiples.countSpecMult(2, 100));
    assertEquals(6, CountMultiples.countSpecMult(3, 200));
    assertEquals(0, CountMultiples.countSpecMult(4, 100));
  }
}
