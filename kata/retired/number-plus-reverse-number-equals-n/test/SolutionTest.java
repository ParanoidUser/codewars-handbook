import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      646, 125
       44, 13
      110, 19
      165, 69
      969, 138
      """)
  void sample(int n, int expected) {
    assertEquals(expected, Kata.find(n));
  }
}