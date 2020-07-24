import static org.springframework.test.util.AssertionErrors.assertEquals;

import org.junit.jupiter.api.Test;

class DRootExampleTest {
  @Test
  void sample() {
    assertEquals("Nope!", 7, DRoot.digital_root(16));
    assertEquals("Nope!", 6, DRoot.digital_root(456));
  }
}
