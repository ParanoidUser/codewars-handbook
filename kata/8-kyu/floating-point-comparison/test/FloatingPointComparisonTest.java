import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FloatingPointComparisonTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      -156.24037, -156.24038
      123.2345, 123.234501
      -1.234, -1.233999
      98.7655, 98.7654999
      -75158.25030, -75158.25017
      """)
  void sample(double a, double b) {
    assertTrue(FloatingPointComparison.approxEquals(a, b));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      175.9827, 82.25
      1456.3652, 1456.3641
      -7.28495, -7.28596
      """)
  void notEquals(double a, double b) {
    assertFalse(FloatingPointComparison.approxEquals(a, b));
  }
}