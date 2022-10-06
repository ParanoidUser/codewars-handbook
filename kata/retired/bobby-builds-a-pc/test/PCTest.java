import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PCTest {
  @Test
  void sample() {
    assertEquals("CPU, GPU, desktopCase.", Kata.partsLeft(false, true, true, false, true, true, false, true));
    assertEquals("Your PC is ready to build!", Kata.partsLeft(true, true, true, true, true, true, true, true));
    assertEquals("No items bought!", Kata.partsLeft(false, false, false, false, false, false, false, false));
  }
}