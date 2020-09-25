import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.validatePin("1234"));
    assertTrue(Solution.validatePin("0000"));
    assertTrue(Solution.validatePin("123456"));
    assertTrue(Solution.validatePin("098765"));
    assertTrue(Solution.validatePin("000000"));
    assertFalse(Solution.validatePin("a234"));
    assertFalse(Solution.validatePin("1.234"));
    assertFalse(Solution.validatePin("-1234"));
    assertFalse(Solution.validatePin("1"));
    assertFalse(Solution.validatePin("12"));
    assertFalse(Solution.validatePin("123"));
    assertFalse(Solution.validatePin("12345"));
    assertFalse(Solution.validatePin("1234567"));
  }
}
