import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertFalse(Kata.eightBitNumber(""));
    assertTrue(Kata.eightBitNumber("0"));
    assertFalse(Kata.eightBitNumber("00"));
    assertTrue(Kata.eightBitNumber("55"));
    assertFalse(Kata.eightBitNumber("042"));
    assertTrue(Kata.eightBitNumber("123"));
    assertTrue(Kata.eightBitNumber("255"));
    assertFalse(Kata.eightBitNumber("256"));
    assertFalse(Kata.eightBitNumber("999"));
    assertFalse(Kata.eightBitNumber("-1"));
  }
}
