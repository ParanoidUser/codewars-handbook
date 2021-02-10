import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class FusionChamberShutdownTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{5, 45, 0}, FusionChamberShutdown.burner(45, 11, 100));
    assertArrayEquals(new int[]{0, 0, 354}, FusionChamberShutdown.burner(354, 1023230, 0));
    assertArrayEquals(new int[]{1, 346, 0}, FusionChamberShutdown.burner(939, 3, 694));
    assertArrayEquals(new int[]{20, 215, 0}, FusionChamberShutdown.burner(215, 41, 82100));
    assertArrayEquals(new int[]{0, 26, 0}, FusionChamberShutdown.burner(113, 0, 52));
  }
}