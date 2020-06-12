import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Case {
  @Test
  void sample() {
    assertEquals("Hello world", ChangeCase.toSentenceCase("Hello World"));
    assertEquals("hello world", ChangeCase.toLowerCase("Hello World"));
    assertEquals("HELLO WORLD", ChangeCase.toUpperCase("Hello World"));
    assertEquals("Hello World", ChangeCase.capitalizeEachWord("Hello World"));
    assertEquals("hELLO wORLD", ChangeCase.toToggleCase("Hello World"));
  }
}
