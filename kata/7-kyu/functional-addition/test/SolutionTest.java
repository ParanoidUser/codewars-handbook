import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void simpleAdd() {
    assertEquals(8, Kata.add(3).applyAsInt(5));
  }
}
