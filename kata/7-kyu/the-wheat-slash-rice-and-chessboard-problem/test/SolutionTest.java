import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0
      1, 1
      2, 2
      3, 2
      4, 3
      562949953421312, 50
      72057594037927936, 57
      """)
  void sample(long grains, int cells) {
    assertEquals(cells, Solution.squaresNeeded(grains));
  }
}