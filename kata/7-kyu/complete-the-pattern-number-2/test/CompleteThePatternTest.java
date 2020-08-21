import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CompleteThePatternTest {
  @Test
  void sample() {
    assertEquals("1", CompleteThePattern.pattern(1));
    assertEquals("54321\n5432\n543\n54\n5", CompleteThePattern.pattern(5));
    assertEquals("10987654321\n1098765432\n109876543\n10987654\n1098765\n109876\n10987\n1098\n109\n10", CompleteThePattern.pattern(10));
    assertEquals("", CompleteThePattern.pattern(0));
    assertEquals("", CompleteThePattern.pattern(-5));
  }
}
