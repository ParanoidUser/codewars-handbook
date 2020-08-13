import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("a0", JomoPipi.antiString("9Z"));
    assertEquals("aBc123", JomoPipi.antiString("678XyZ"));
    assertEquals("678bcdXYZ", JomoPipi.antiString("abcWXY123"));
  }
}
