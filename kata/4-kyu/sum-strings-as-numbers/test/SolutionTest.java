import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("5", Kata.sumStrings("", "5"));
    assertEquals("579", Kata.sumStrings("123", "456"));
    assertEquals("725237013407", Kata.sumStrings("0725237013077", "330"));
    assertEquals("466653230868859383811628152", Kata.sumStrings("0016352318265084668", "466653230852507065546543484"));
  }
}
