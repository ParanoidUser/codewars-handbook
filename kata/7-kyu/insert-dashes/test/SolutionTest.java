import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("4547-9-3", Solution.insertDash(454793));
    assertEquals("123456", Solution.insertDash(123456));
    assertEquals("1003-567", Solution.insertDash(1003567));
  }
}