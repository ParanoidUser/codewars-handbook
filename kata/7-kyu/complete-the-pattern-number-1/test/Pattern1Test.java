import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Pattern1Test {
  @Test
  void sample() {
    assertEquals("", Pattern1.pattern(0));
    assertEquals("1", Pattern1.pattern(1));
    assertEquals("1\n22", Pattern1.pattern(2));
    assertEquals("1\n22\n333\n4444\n55555", Pattern1.pattern(5));
    assertEquals("", Pattern1.pattern(-25));
  }
}