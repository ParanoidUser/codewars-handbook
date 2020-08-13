import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.sixBitNumber("0"));
    assertTrue(Kata.sixBitNumber("55"));
    assertTrue(Kata.sixBitNumber("63"));
    assertTrue(Kata.sixBitNumber("5"));
    assertFalse(Kata.sixBitNumber(""));
    assertFalse(Kata.sixBitNumber("00"));
    assertFalse(Kata.sixBitNumber("64"));
    assertFalse(Kata.sixBitNumber("-0"));
    assertFalse(Kata.sixBitNumber("-5"));
    assertFalse(Kata.sixBitNumber("05"));
  }
}
