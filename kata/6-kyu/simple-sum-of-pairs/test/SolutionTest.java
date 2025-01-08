import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0
      1, 1
      18, 18
      29, 11
      1140, 33
      50000000, 68
      458453062, 109
      8130375074, 119
      """)
  void sample(long n, int sum) {
    assertEquals(sum, Solution.solve(n));
  }
}