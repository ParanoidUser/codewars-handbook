import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DRootExampleTest {
  @Test
  void sample() {
    assertEquals(7, DRoot.digital_root(16));
    assertEquals(6, DRoot.digital_root(456));
  }
}
