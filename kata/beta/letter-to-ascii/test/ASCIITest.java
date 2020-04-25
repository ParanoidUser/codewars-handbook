import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ASCIITest {
  @Test
  void sample() {
    assertEquals(97, ASCII.charToASCII('a'));
    assertEquals(104, ASCII.charToASCII('h'));
    assertEquals(33, ASCII.charToASCII('!'));
    assertEquals(36, ASCII.charToASCII('$'));
    assertEquals(126, ASCII.charToASCII('~'));
  }
}