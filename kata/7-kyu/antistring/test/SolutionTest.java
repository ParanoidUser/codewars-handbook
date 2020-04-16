import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basic1() {
    assertEquals("a0", JomoPipi.antiString("9Z"));
  }

  @Test
  public void basic2() {
    assertEquals("aBc123", JomoPipi.antiString("678XyZ"));
  }

  @Test
  public void basic3() {
    assertEquals("678bcdXYZ", JomoPipi.antiString("abcWXY123"));
  }
}
