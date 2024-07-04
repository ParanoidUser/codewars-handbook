import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1321, 3
      0323456, 9
      2113, 5
      1110, 1
      121, 2
      """)
  void sample(String str, int expected) {
    assertEquals(expected, Kata.blowCandles(str));
  }
}