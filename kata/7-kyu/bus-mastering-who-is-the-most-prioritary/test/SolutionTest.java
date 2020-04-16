import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals("001000000", BusMastering.arbitrate("001000101", 9));
    assertEquals("000000100", BusMastering.arbitrate("000000101", 9));
    assertEquals("0000", BusMastering.arbitrate("0000", 4));
  }
}
