import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AbbreviatorTests {
  @Test
  void sample() {
    assertEquals("i18n", new Abbreviator().abbreviate("internationalization"));
    assertEquals("on; d4e-b6d5sat", new Abbreviator().abbreviate("on; double-barreled5sat"));
    assertEquals("You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n", new Abbreviator().abbreviate("You need, need not want, to complete this code-wars mission"));
  }
}
