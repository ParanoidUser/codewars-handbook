import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArabToRomanBasicTests {
  @Test
  void sample() {
    assertEquals("I", ArabicToRomanConverter.toRoman(1));
    assertEquals("II", ArabicToRomanConverter.toRoman(2));
    assertEquals("III", ArabicToRomanConverter.toRoman(3));
    assertEquals("IV", ArabicToRomanConverter.toRoman(4));
    assertEquals("V", ArabicToRomanConverter.toRoman(5));
    assertEquals("VI", ArabicToRomanConverter.toRoman(6));
    assertEquals("NaR", ArabicToRomanConverter.toRoman(0));
    assertEquals("NaR", ArabicToRomanConverter.toRoman(-1));
    assertEquals("NaR", ArabicToRomanConverter.toRoman(1000));
  }
}