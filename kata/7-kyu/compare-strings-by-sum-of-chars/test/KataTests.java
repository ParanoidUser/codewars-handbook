import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertTrue(Kata.compare("AD", "BC"));
    assertTrue(Kata.compare("A!D", ""));
    assertFalse(Kata.compare("AD", "DD"));
    assertFalse(Kata.compare(null, "DD"));
  }
}
