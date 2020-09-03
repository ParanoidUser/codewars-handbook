import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("ac", new BackspacesInString().cleanString("abc#d##c"));
    assertEquals("", new BackspacesInString().cleanString("abc####d##c#"));
  }
}
