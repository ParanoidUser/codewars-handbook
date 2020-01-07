import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExampleTests {

  private void doIntTest(final int a) {
    final long b = Dinglemouse.int123(a);
    System.out.println("" + a + " + " + b + " = " + (int) (a + b));
    assertTrue("B must be >= 0", b >= 0);
    assertEquals("A + B must give 123", 123, (int) (a + b));
  }

  @Test
  public void testLess() {
    doIntTest(0);
  }

  @Test
  public void testSame() {
    doIntTest(123);
  }

  @Test
  public void testGreater() {
    doIntTest(500);
  }
}
