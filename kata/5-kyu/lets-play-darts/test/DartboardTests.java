import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DartboardTests {
  @Test
  void sample() {
    assertEquals("X", Dartboard.getScore(-133.69, -147.38));
    assertEquals("DB", Dartboard.getScore(4.06, 0.71));
    assertEquals("SB", Dartboard.getScore(2.38, -6.06));
    assertEquals("19", Dartboard.getScore(-14.568070690087325, -58.22411710478049));
    assertEquals("20", Dartboard.getScore(-5.43, 117.95));
    assertEquals("7", Dartboard.getScore(-73.905, -95.94));
    assertEquals("T2", Dartboard.getScore(55.53, -87.95));
    assertEquals("D9", Dartboard.getScore(-145.19, 86.53));
  }
}
