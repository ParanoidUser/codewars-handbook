import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals('7', Ascii.getChar(55));
    assertEquals('8', Ascii.getChar(56));
    assertEquals('9', Ascii.getChar(57));
    assertEquals(':', Ascii.getChar(58));
    assertEquals(';', Ascii.getChar(59));
    assertEquals('<', Ascii.getChar(60));
    assertEquals('=', Ascii.getChar(61));
    assertEquals('>', Ascii.getChar(62));
    assertEquals('?', Ascii.getChar(63));
    assertEquals('@', Ascii.getChar(64));
    assertEquals('A', Ascii.getChar(65));
    assertEquals('!', Ascii.getChar(33));
  }
}
