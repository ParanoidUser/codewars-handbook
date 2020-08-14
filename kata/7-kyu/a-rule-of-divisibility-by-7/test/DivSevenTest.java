import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DivSevenTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{7, 2}, DivSeven.seven(1603));
    assertArrayEquals(new long[]{35, 1}, DivSeven.seven(371));
    assertArrayEquals(new long[]{42, 1}, DivSeven.seven(483));
  }
}
