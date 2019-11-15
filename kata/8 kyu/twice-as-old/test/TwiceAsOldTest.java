import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwiceAsOldTest {
  @Test
  public void testSomething() {
    assertEquals(30, TwiceAsOld.TwiceAsOld(30, 0));
    assertEquals(16, TwiceAsOld.TwiceAsOld(30, 7));
    assertEquals(15, TwiceAsOld.TwiceAsOld(45, 30));
  }
}
