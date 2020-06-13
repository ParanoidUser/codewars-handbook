import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EpidemTest {
  @Test
  void sample() {
    assertEquals(420, Epidem.epidemic(18, 432, 1004, 1, 0.00209, 0.51));
    assertEquals(461, Epidem.epidemic(12, 288, 1007, 2, 0.00206, 0.45));
    assertEquals(409, Epidem.epidemic(13, 312, 999, 1, 0.00221, 0.55));
    assertEquals(474, Epidem.epidemic(24, 576, 1005, 1, 0.00216, 0.45));
    assertEquals(460, Epidem.epidemic(24, 576, 982, 1, 0.00214, 0.44));
    assertEquals(386, Epidem.epidemic(20, 480, 1000, 1, 0.00199, 0.53));
    assertEquals(433, Epidem.epidemic(28, 672, 980, 1, 0.00198, 0.44));
    assertEquals(483, Epidem.epidemic(14, 336, 996, 2, 0.00206, 0.41));
    assertEquals(414, Epidem.epidemic(13, 312, 993, 2, 0.0021, 0.51));
    assertEquals(368, Epidem.epidemic(28, 672, 999, 1, 0.00197, 0.55));
  }
}
