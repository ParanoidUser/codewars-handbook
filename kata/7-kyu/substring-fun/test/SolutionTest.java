import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      '',
      yes, yoda>best>has
      123, 1___>_2___>__3_
      """)
  void sample(String expected, String input) {
    String[] words = input != null ? input.split(">") : new String[0];
    assertEquals(expected, SubstringFun.nthChar(words));
  }
}