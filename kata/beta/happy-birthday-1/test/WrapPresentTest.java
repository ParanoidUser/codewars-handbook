import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WrapPresentTest {
  @Test
  public void test() {
    assertEquals(162, WrapPresent.wrap(17, 32, 11));
    assertEquals(124, WrapPresent.wrap(13, 13, 13));
    assertEquals(32, WrapPresent.wrap(1, 3, 1));
  }
}
