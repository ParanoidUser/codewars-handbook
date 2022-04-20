import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BurglarTest {
  @Test
  void sample() {
    WeakChest chest = new WeakChest(42);
    assertTrue(new Burglar().lockpick(chest).isOpen());
  }
}