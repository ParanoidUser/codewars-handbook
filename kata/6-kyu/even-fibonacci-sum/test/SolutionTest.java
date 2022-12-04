import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1, 0
      5, 2
      8, 2
      10, 10
      100, 44
      1000, 798
      1000000, 1089154
      100000000, 82790070
      1000000000, 350704366
      2147483647, 1485607536
      """)
  void sample(int max, long expected) {
    assertEquals(expected, Kata.fibonacci(max));
  }
}