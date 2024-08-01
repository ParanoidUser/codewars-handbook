import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      2500, 0.5, 3000000, 35, 5, 93278.32814051147
      2500, 0.5, 2000000, 35, 5, 174425.07627465756
      """)
  void sample(int c, double r, int s, int t, int w, double expected) {
    assertEquals(expected, Kata.maxWeddingCost(c, r, s, t, w), 1e-4 * expected);
  }
}