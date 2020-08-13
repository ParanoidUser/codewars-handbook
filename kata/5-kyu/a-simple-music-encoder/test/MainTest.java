import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void sample() {
    assertEquals("1,2*2,3", new Encoder().compress(new int[]{1, 2, 2, 3}));
    assertEquals("1,3-5,7", new Encoder().compress(new int[]{1, 3, 4, 5, 7}));
    assertEquals("1,5-3,7", new Encoder().compress(new int[]{1, 5, 4, 3, 7}));
    assertEquals("1,10-6/2,7", new Encoder().compress(new int[]{1, 10, 8, 6, 7}));
  }
}
