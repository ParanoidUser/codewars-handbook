import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HoopCountTest {
  @Test
  void sample() {
    assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
    assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
  }
}