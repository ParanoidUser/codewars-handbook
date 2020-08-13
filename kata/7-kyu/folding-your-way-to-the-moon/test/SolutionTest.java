import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals((Long) 42L, PaperFolder.fold(384000000.0));
    assertEquals((Long) 0L, PaperFolder.fold(0.00005));
    assertNull(PaperFolder.fold(-0.00005));
  }
}
