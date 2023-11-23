import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RoundAndRoundTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      18.123, 18.12
      16.765, 16.77
      16.355, 16.36
      7.477, 7.48
      2, 2
      1.455, 1.46
      1.1950000000000001, 1.20
      1.1949999999999999, 1.19
      1.1850000000000001, 1.19
      1.1849999999999999, 1.18
      1.055, 1.06
      1.025, 1.03
      0, 0
      -4.999, -5
      -1.025, -1.03
      -1.055, -1.06
      -1.1849999999999999, -1.18
      -1.1850000000000001, -1.19
      -1.1949999999999999, -1.19
      -1.1950000000000001, -1.20
      -1.455, -1.46
      -16.345, -16.35
      -16.765, -16.77
      """)
  void sample(double number, double expected) {
    assertEquals(expected, RoundAndRound.roundTo2DecimalPlaces(number), 0.01);
  }
}