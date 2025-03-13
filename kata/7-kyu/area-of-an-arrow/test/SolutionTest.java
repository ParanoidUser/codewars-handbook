import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      4, 2, 2
      7, 6, 10.5
      25, 25, 156.25
      """)
  void sample(int a, int b, double expected) {
    assertEquals(expected, Solution.arrowArea(a, b), 1e-10);
  }
}