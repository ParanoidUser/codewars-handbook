import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PluralTest {
  @Test
  void sample() {
    assertTrue(Plural.isPlural(0f));
    assertTrue(Plural.isPlural(0.5f));
    assertFalse(Plural.isPlural(1f));
    assertTrue(Plural.isPlural(100f));
  }
}
