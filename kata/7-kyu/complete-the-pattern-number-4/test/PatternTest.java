import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PatternTest {
  @Test
  void sample() {
    assertEquals("1", Pattern.pattern(1));
    assertEquals("12\n2", Pattern.pattern(2));
    assertEquals("12345\n2345\n345\n45\n5", Pattern.pattern(5));
    assertEquals("", Pattern.pattern(0));
    assertEquals("", Pattern.pattern(-25));
    assertEquals("", Pattern.pattern(-59));
  }
}
