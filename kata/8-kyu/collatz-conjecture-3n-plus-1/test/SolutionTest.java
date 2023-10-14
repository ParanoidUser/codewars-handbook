import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1, 0
      5, 5
      6, 8
      23, 15
      """)
  void sample(int n, int collatz) {
    assertEquals(collatz, CollatzConjecture.hotpo(n));
  }
}