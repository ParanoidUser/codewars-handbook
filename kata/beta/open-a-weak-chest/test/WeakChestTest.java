import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeakChestTest {
  @Test
  void valid_pid_test() {
    var chest = new WeakChest(42);
    assertFalse(chest.isOpen());
    chest.openChest(42);
    assertTrue(chest.isOpen());
  }

  @Test
  void invalid_pid_test() {
    var chest = new WeakChest(42);
    assertFalse(chest.isOpen());
    assertThrows(BadCodeException.class, () -> chest.openChest(43));
    assertFalse(chest.isOpen());
  }
}