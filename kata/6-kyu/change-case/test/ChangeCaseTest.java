import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChangeCaseTest {
  @Test
  void sample() {
    assertEquals("Hello world", new ChangeCase().toSentenceCase("Hello World"));
    assertEquals("hello world", new ChangeCase().toLowerCase("Hello World"));
    assertEquals("HELLO WORLD", new ChangeCase().toUpperCase("Hello World"));
    assertEquals("Hello World", new ChangeCase().capitalizeEachWord("Hello World"));
    assertEquals("hELLO wORLD", new ChangeCase().toToggleCase("Hello World"));
  }
}
