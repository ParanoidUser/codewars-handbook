import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void validPins() {
    assertTrue(Solution.validatePin("1234"));
    assertTrue(Solution.validatePin("0000"));
    assertTrue(Solution.validatePin("1111"));
    assertTrue(Solution.validatePin("123456"));
    assertTrue(Solution.validatePin("098765"));
    assertTrue(Solution.validatePin("000000"));
    assertTrue(Solution.validatePin("090909"));
  }

  @Test
  public void nonDigitCharacters() {
    assertFalse(Solution.validatePin("a234"));
    assertFalse(Solution.validatePin(".234"));
  }

  @Test
  public void invalidLengths() {
    assertFalse(Solution.validatePin("1"));
    assertFalse(Solution.validatePin("12"));
    assertFalse(Solution.validatePin("123"));
    assertFalse(Solution.validatePin("12345"));
    assertFalse(Solution.validatePin("1234567"));
    assertFalse(Solution.validatePin("-1234"));
    assertFalse(Solution.validatePin("1.234"));
    assertFalse(Solution.validatePin("00000000"));
  }
}
