import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KataTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      hello, hll
      how are you today?, hw r y tdy?
      complain, cmpln
      never, nvr
      """)
  void sample(String input, String expected) {
    assertEquals(expected, Kata.shortcut(input));
  }
}
