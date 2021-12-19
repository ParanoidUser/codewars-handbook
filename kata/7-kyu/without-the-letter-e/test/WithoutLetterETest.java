import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class WithoutLetterETest {
  @Test
  void sample() {
    assertEquals("There is no \"e\".", WithoutLetterE.findE("actual"));
    assertEquals("1", WithoutLetterE.findE("e"));
    assertEquals("1", WithoutLetterE.findE("English"));
    assertEquals("4", WithoutLetterE.findE("English exercise"));
    assertEquals("", WithoutLetterE.findE(""));
    assertNull(WithoutLetterE.findE(null));
  }
}