import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class TestPigLatin {
  @Test
  void sample() {
    assertEquals("apmay", PigLatin.translate("map"));
    assertEquals("eggway", PigLatin.translate("egg"));
    assertEquals("aghettispay", PigLatin.translate("spaghetti"));
    assertNull(PigLatin.translate("123"));
  }
}
