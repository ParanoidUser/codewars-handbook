import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ASCIITest {
  @Test
  public void testCharToASCII() {
    assertEquals(97, ASCII.charToASCII('a'));
    assertEquals(104, ASCII.charToASCII('h'));
    assertEquals(33, ASCII.charToASCII('!'));
    assertEquals(36, ASCII.charToASCII('$'));
    assertEquals(126, ASCII.charToASCII('~'));
  }
}