import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class WhichAreInTest {
  @Test
  void sample() {
    String[] a = new String[]{"arp", "live", "strong"};
    String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
    assertArrayEquals(new String[]{"arp", "live", "strong"}, WhichAreIn.inArray(a, b));
  }
}
