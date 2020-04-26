import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StripCommentsTest {
  @Test
  void sample() {
    assertEquals("apples, pears\ngrapes\nbananas", StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
    assertEquals("a\nc\nd", StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"}));
  }
}
