import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConverterTest {
  @Test
  void sample() {
    assertEquals(1, Converter.binToDecimal("1"));
    assertEquals(0, Converter.binToDecimal("0"));
    assertEquals(73, Converter.binToDecimal("1001001"));
  }
}