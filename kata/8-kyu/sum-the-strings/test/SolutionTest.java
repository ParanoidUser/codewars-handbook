import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      4, 5, 9
      34, 5, 39
      '', 8, 8
      9, '', 9
      '', '', 0
      """)
  void sample(String a, String b, String expected) {
    assertEquals(expected, Kata.sumStr(a, b));
  }
}