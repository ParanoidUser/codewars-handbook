import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArabToRomanBasicTests {
  @Test
  void sample() {
    assertEquals("I", new ArabicToRomanConverter().toRoman(1));
    assertEquals("II", new ArabicToRomanConverter().toRoman(2));
    assertEquals("III", new ArabicToRomanConverter().toRoman(3));
    assertEquals("IV", new ArabicToRomanConverter().toRoman(4));
    assertEquals("V", new ArabicToRomanConverter().toRoman(5));
    assertEquals("VI", new ArabicToRomanConverter().toRoman(6));
    assertEquals("NaR", new ArabicToRomanConverter().toRoman(0));
    assertEquals("NaR", new ArabicToRomanConverter().toRoman(-1));
    assertEquals("NaR", new ArabicToRomanConverter().toRoman(1000));
  }
}