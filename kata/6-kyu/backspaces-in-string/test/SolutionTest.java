import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("ac", BackspacesInString.cleanString("abc#d##c"));
    assertEquals("", BackspacesInString.cleanString("abc####d##c#"));
  }
}
