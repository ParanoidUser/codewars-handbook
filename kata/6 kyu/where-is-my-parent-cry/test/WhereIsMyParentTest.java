import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhereIsMyParentTest {
  @Test
  public void basicTests() {
    assertEquals("AaBb", WhereIsMyParent.findChildren("abBA"));
    assertEquals("AaaaaaZzzz", WhereIsMyParent.findChildren("AaaaaZazzz"));
    assertEquals("AaBbbCcc", WhereIsMyParent.findChildren("CbcBcbaA"));
    assertEquals("FfUuuuXx", WhereIsMyParent.findChildren("xXfuUuuF"));
    assertEquals("AaaaCccGggggKkkLQqqqRUuVXxxxx", WhereIsMyParent.findChildren("qgkQggkKqRGqgLCccUuAaaaXxxxxV"));
    assertEquals("", WhereIsMyParent.findChildren(""));
  }
}
