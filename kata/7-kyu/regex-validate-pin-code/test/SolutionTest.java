import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
  @ParameterizedTest
  @ValueSource(strings = {"1234", "0000", "123456", "098765", "000000"})
  void valid(String pin) {
    assertTrue(Solution.validatePin(pin));
  }

  @ParameterizedTest
  @ValueSource(strings = {"a234", "1.234", "-1234", "1", "12", "123", "12345", "1234567"})
  void invalid(String pin) {
    assertFalse(Solution.validatePin(pin));
  }
}
