import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void fixedTests() {
    assertEquals(7, Kata.oddCount(15));
    assertEquals(7511, Kata.oddCount(15023));
  }
}
