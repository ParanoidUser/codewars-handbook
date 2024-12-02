import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0
      1, 0.25
      2, 1
      3, 2.25
      """)
  void sample(int radius, double segment) {
    assertEquals(segment, Solution.bloodMoon(radius), 1E-5);
  }
}