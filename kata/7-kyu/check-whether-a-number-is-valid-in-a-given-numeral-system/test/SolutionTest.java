import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      61262, 8
      ABCDEF, 16
      009, 10
      0, 5
      3C52Q6W8V1, 34
      """)
  void valid(String num, int base) {
    assertTrue(Solution.validateBase(num, base));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      25172, 5
      EG, 16
      W, 32
      99235, 9
      """)
  void invalid(String num, int base) {
    assertFalse(Solution.validateBase(num, base));
  }
}