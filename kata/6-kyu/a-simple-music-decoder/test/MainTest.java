import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 2, 2, 3}, new Decoder().uncompress("1,2*2,3"));
    assertArrayEquals(new int[]{1, 3, 4, 5, 7}, new Decoder().uncompress("1,3-5,7"));
    assertArrayEquals(new int[]{1, 5, 4, 3, 7}, new Decoder().uncompress("1,5-3,7"));
    assertArrayEquals(new int[]{1, 10, 8, 6, 7}, new Decoder().uncompress("1,10-6/2,7"));
  }
}
