import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KumiteTest {
  @Test
  void sample() {
    assertTrue(Kumite.block(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}));
    assertTrue(Kumite.block(new int[]{8, 7, 1, 9}, new int[]{8, 7, 1, 9}));
    assertTrue(Kumite.block(new int[]{1, 9, 3, 6}, new int[]{4, 8, 5, 5}));
    assertTrue(Kumite.block(new int[0], new int[]{8, 7, 1, 9}));
    assertFalse(Kumite.block(new int[]{2, 9, 9, 7}, new int[]{1, 1, 3, 8}));
    assertFalse(Kumite.block(new int[]{1, 3, 5, 7}, new int[]{2, 2, 6, 5}));
    assertFalse(Kumite.block(new int[]{1, 5, 3}, new int[0]));
    assertFalse(Kumite.block(new int[]{0}, new int[0]));
  }
}