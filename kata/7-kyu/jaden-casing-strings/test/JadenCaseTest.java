import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JadenCaseTest {
  @Test
  public void test() {
    assertEquals("Most Trees Are Blue", JadenCase.toJadenCase("most trees are blue"));
  }

  @Test
  public void testNullArg() {
    assertNull("Must return null when the arg is null", JadenCase.toJadenCase(null));
  }

  @Test
  public void testEmptyArg() {
    assertNull("Must return null when the arg is empty string", JadenCase.toJadenCase(""));
  }
}
