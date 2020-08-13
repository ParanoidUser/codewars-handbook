import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.eightBitNumber("0"));
    assertTrue(Kata.eightBitNumber("55"));
    assertTrue(Kata.eightBitNumber("123"));
    assertTrue(Kata.eightBitNumber("255"));
    assertFalse(Kata.eightBitNumber(""));
    assertFalse(Kata.eightBitNumber("00"));
    assertFalse(Kata.eightBitNumber("042"));
    assertFalse(Kata.eightBitNumber("256"));
    assertFalse(Kata.eightBitNumber("999"));
    assertFalse(Kata.eightBitNumber("-1"));
  }
}
