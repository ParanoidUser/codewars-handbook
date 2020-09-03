import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class TestPigLatin {
  @Test
  void sample() {
    assertEquals("apmay", new PigLatin().translate("map"));
    assertEquals("eggway", new PigLatin().translate("egg"));
    assertEquals("aghettispay", new PigLatin().translate("spaghetti"));
    assertNull(new PigLatin().translate("123"));
  }
}
