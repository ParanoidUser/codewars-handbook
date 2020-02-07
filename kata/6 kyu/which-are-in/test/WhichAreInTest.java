import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class WhichAreInTest {
  @Test
  public void test() {
    String[] a = new String[] {"arp", "live", "strong"};
    String[] b = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
    assertArrayEquals(new String[] {"arp", "live", "strong"}, WhichAreIn.inArray(a, b));
  }
}
