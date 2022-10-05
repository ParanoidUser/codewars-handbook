import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       -1,  1,
       -1,  2,
       -1,  3,
       -1,  4,
        6,  5
        8,  6,
       12,  7,
       24, 10,
       30, 11,
       42, 13,
       72, 17,
      168, 26,
      255, 32,
      323, 36,
      380, 39
        """)
  void exampleTestCases(long expected, long n) {
    assertEquals(expected, Kata.maxIntChain(n));
  }
}
