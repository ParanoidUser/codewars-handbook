import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DifferenceOfSquaresTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      5, 170
      10, 2640
      100, 25164150
      """)
  void sample(int n, int expected) {
    assertEquals(expected, Kata.differenceOfSquares(n));
  }
}