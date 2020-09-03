import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class JadenCaseTest {
  @Test
  void sample() {
    assertEquals("Most Trees Are Blue", new JadenCase().toJadenCase("most trees are blue"));
    assertNull(new JadenCase().toJadenCase(null));
    assertNull(new JadenCase().toJadenCase(""));
  }
}
