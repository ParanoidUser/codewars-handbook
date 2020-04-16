import static org.junit.Assert.*;

import org.junit.Test;

public class AbbreviatorTests {
  @Test
  public void testInternationalization() {
    assertEquals("i18n", Abbreviator.abbreviate("internationalization"));
    assertEquals("You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n", Abbreviator.abbreviate("You need, need not want, to complete this code-wars mission"));
    assertEquals("on; d4e-b6d5sat", Abbreviator.abbreviate("on; double-barreled5sat"));
  }
}
