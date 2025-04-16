import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       -3,   2,  -3 is smaller than 2
        1,   2,   1 is smaller than 2
       45,  51,  45 is smaller than 51
        1,   1,   1 is equal to 1
      100, 100, 100 is equal to 100
       20,  19,  20 is greater than 19
      100,  80, 100 is greater than 80
      """)
  void sample(int a, int b, String phrase) {
    assertEquals(phrase, NoIfsNoButs.noIfsNoButs(a, b));
  }
}