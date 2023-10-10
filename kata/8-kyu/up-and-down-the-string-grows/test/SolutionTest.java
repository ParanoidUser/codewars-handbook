import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    String upDown = StrangeString.STRANGE_STRING.toUpperCase().toLowerCase();
    assertEquals(StrangeString.STRANGE_STRING.length() + 1, upDown.length());
  }
}