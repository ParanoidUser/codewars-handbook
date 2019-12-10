import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StripCommentsTest {
  @Test
  public void stripComments() {
    assertEquals("apples, pears\ngrapes\nbananas", StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] {"#", "!"}));
    assertEquals("a\nc\nd", StripComments.stripComments("a #b\nc\nd $e f g", new String[] {"#", "$"}));
  }
}
