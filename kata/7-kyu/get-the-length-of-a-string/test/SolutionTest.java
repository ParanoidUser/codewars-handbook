import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      '', 0
      abcd, 4
      中国, 2
      𝓪𝓫𝓬𝓭, 4
      𨭎𩷶, 2
      😸🦌🚀, 3
      ↓→↑←, 4
      '\nabc\ndef\n', 9
      """)
  void sample(String str, int expected) {
    assertEquals(expected, Kata.getRealLength(str));
  }
}