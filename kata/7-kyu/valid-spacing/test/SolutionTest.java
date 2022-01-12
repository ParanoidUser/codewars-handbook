import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.validSpacing("Hello world"));
    assertFalse(Kata.validSpacing(" Hello world"));
    assertFalse(Kata.validSpacing("Hello  world "));
    assertTrue(Kata.validSpacing("Hello"));
    assertTrue(Kata.validSpacing("Helloworld"));
  }
}
