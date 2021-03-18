import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class HTMLComplementaryColorTest {
  @Test
  void sample() {
    assertEquals("#FFFFFF", HTMLComplementaryColor.getReversedColor(""));
    assertEquals("#FFFFFF", HTMLComplementaryColor.getReversedColor("0"));
    assertEquals("#FF00FF", HTMLComplementaryColor.getReversedColor("ff00"));
    assertThrows(IllegalArgumentException.class, () -> HTMLComplementaryColor.getReversedColor(null));
    assertThrows(IllegalArgumentException.class, () -> HTMLComplementaryColor.getReversedColor("1234567"));
    assertThrows(IllegalArgumentException.class, () -> HTMLComplementaryColor.getReversedColor("AA00ZZ"));
    assertThrows(IllegalArgumentException.class, () -> HTMLComplementaryColor.getReversedColor("#AAFFAA"));
  }
}