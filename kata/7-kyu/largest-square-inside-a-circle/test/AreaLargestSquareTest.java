import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AreaLargestSquareTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      5, 50
      7, 98
      15, 450
      """)
  void sample(int r, int expected) {
    assertEquals(expected, Kata.areaLargestSquare(r));
  }
}