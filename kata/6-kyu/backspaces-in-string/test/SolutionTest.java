import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testCleanString() {
    assertEquals("ac", BackspacesInString.cleanString("abc#d##c"));
    assertEquals("", BackspacesInString.cleanString("abc####d##c#"));
  }
}
