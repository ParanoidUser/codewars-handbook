import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      RGBRGB, 0
      RRGGBB, 3
      BGRBBGGBRRR, 4
      GBBBGGRRGRB, 4
      GBRGGRBBBBRRGGGB, 7
      """)
  void sample(String stones, int duplicates) {
    assertEquals(duplicates, Solution.solve(stones));
  }
}