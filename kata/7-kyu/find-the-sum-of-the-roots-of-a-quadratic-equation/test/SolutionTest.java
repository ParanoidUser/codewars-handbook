import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.OptionalDouble;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1, -35, -23, 35.0
      6, 0, -24, 0
      -5, 21, 0, 4.2
      1, 5, -24, -5
      3, 11, 6, -3.67
      -14, 0, 0, 0
      1, -11, 30, 11
      1, 6, 9, -6
      8, 47, 41, -5.88
      """)
  void realRoots(int a, int b, int c, double sum) {
    assertEquals(sum, Solution.roots(a, b, c).orElseThrow(), .01);
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      1, 3, 12
      2, 2, 9
      6, 4, 8
      """)
  void complexRoots(int a, int b, int c) {
    assertEquals(OptionalDouble.empty(), Solution.roots(a, b, c));
  }
}