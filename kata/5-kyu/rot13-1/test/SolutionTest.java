import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      test, grfg
      Test, Grfg
      !@#$, !@#$
      """)
  void sample(String message, String expected) {
    assertEquals(expected, Kata.rot13(message));
  }
}