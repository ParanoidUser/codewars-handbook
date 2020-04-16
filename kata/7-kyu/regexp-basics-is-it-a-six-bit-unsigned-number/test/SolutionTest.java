import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertFalse(Kata.sixBitNumber(""));
    assertTrue(Kata.sixBitNumber("0"));
    assertFalse(Kata.sixBitNumber("00"));
    assertTrue(Kata.sixBitNumber("55"));
    assertTrue(Kata.sixBitNumber("63"));
    assertFalse(Kata.sixBitNumber("64"));
    assertFalse(Kata.sixBitNumber("-0"));
    assertFalse(Kata.sixBitNumber("-5"));
    assertFalse(Kata.sixBitNumber("05"));
    assertTrue(Kata.sixBitNumber("5"));
  }
}
