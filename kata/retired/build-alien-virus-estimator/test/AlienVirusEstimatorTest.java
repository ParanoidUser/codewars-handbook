import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AlienVirusEstimatorTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      2, 4, 3, 10
      4, 2, 10, 22
      7, -5, 8, -1
      """)
  void sample(long escaped, long spread, long minutes, long units) {
    assertEquals(units, AlienVirusEstimator.findVirusUnits(escaped, spread, minutes));
  }
}