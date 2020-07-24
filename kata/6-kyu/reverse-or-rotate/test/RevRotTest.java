import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RevRotTest {
  @Test
  void sample() {
    assertEquals("", RevRot.revRot("", 0));
    assertEquals("", RevRot.revRot("1234", 0));
    assertEquals("", RevRot.revRot("1234", 5));
    assertEquals("3049910367518278", RevRot.revRot("3304991087281576", 8));
    assertEquals("330479108928157", RevRot.revRot("733049910872815764", 5));
  }
}
