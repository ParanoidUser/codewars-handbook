import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BurglarTest {
  @Test
  void sample() {
    assertTrue(new Burglar().lockpick(new WeakChest(42)).isOpen());
    assertFalse(new Burglar().lockpick(new WeakChest(-42)).isOpen());
  }
}