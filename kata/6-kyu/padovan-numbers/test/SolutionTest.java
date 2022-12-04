import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 1
      1, 1
      2, 1
      3, 2
      4, 2
      5, 3
      6, 4
      7, 5
      8, 7
      9, 9
      """)
  void sample(int n, int expected) {
    assertEquals(expected, Solution.padovan(n));
  }
}
