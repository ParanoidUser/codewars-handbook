import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InterlockableTests {
  @ParameterizedTest
  @CsvSource(textBlock = """
      9, 4
      5, 2
      0, 8
      """)
  void sample(long a, long b) {
    assertTrue(Kata.interlockable(a, b));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      3, 6
      7, 1
      """)
  void negative(long a, long b) {
    assertFalse(Kata.interlockable(a, b));
  }
}