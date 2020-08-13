import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LuckyNumberTest {
  @Test
  void sample() {
    assertTrue(LuckyNumber.isLucky(0));
    assertTrue(LuckyNumber.isLucky(1892376));
    assertFalse(LuckyNumber.isLucky(189237));
  }
}
