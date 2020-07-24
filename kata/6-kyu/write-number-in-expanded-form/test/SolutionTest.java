import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("10 + 2", Kata.expandedForm(12));
    assertEquals("40 + 2", Kata.expandedForm(42));
    assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
  }
}
