import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DecodeResistorColorsTest {
  @Test
  void sample() {
    assertEquals("47 ohms, 20%", DecodeResistorColors.decodeResistorColors("yellow violet black"));
    assertEquals("4.7k ohms, 5%", DecodeResistorColors.decodeResistorColors("yellow violet red gold"));
    assertEquals("1M ohms, 10%", DecodeResistorColors.decodeResistorColors("brown black green silver"));
  }
}
