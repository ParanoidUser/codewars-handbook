import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IKEATest {
  @Test
  void sample() {
    assertTrue(new IKEA().checkEnoughScrews(4, 10));
    assertFalse(new IKEA().checkEnoughScrews(6, 20));
    assertTrue(new IKEA().checkEnoughScrews(3, 6));
  }
}