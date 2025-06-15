import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1, 2, +, 3
      6, 2, +, 8
      4, 3, -, 1
      5, 5, *, 25
      5, 4, /, 1.25
      """)
  void basicOperation(double a, double b, String op, double expected) {
    assertEquals(expected, Calculator.calculate(a, b, op), 1e-3);
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      6, 2, &
      3, 5, \\
      5, 5, =
      6, 3, '\t'
      """)
  void unsupportedOperation(double a, double b, String op) {
    assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(a, b, op));
  }
}