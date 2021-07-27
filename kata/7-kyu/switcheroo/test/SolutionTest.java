import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("abc", Switch.switcheroo("bac"));
    assertEquals("ccc", Switch.switcheroo("ccc"));
    assertEquals("aaabcccbaaa", Switch.switcheroo("bbbacccabbb"));
  }
}
