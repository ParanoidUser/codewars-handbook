import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(delimiter = '|', textBlock = """
      abcdeb | b | 2
      abcdeb | a | 1
      ccddeeccddeecc | cc | 3
      aaabbbccc | bb | 1
      ,,,..239,,,,,., | ,, | 3
      """)
  void sample(String fullText, String search, int expected) {
    assertEquals(expected, Solution.substringCount(fullText, search));
  }
}