import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WhereIsMyParentTest {
  @Test
  void sample() {
    assertEquals("AaBb", WhereIsMyParent.findChildren("abBA"));
    assertEquals("AaaaaaZzzz", WhereIsMyParent.findChildren("AaaaaZazzz"));
    assertEquals("AaBbbCcc", WhereIsMyParent.findChildren("CbcBcbaA"));
    assertEquals("FfUuuuXx", WhereIsMyParent.findChildren("xXfuUuuF"));
    assertEquals("AaaaCccGggggKkkLQqqqRUuVXxxxx", WhereIsMyParent.findChildren("qgkQggkKqRGqgLCccUuAaaaXxxxxV"));
    assertEquals("", WhereIsMyParent.findChildren(""));
  }
}
