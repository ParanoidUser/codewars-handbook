import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0
      5, 5
      10, 10
      90072355, 56295225
      """)
  void sample(int eggs, int time) {
    assertEquals(time, BoilingWater.cookingTime(eggs));
  }
}