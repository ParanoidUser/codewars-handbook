import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {
  @Test
  void sample() {
    assertTrue(NumberUtils.isNarcissistic(153));
    assertTrue(NumberUtils.isNarcissistic(1634));
    assertFalse(NumberUtils.isNarcissistic(112));
  }
}