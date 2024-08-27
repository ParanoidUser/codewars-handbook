import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KataTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      Hi!, Hi!
      Hi!!!, Hi!
      !Hi, Hi!
      !Hi!, Hi!
      Hi! Hi!, Hi Hi!
      Hi, Hi!
      """)
  void sample(String s, String expected) {
    assertEquals(expected, Kata.remove(s));
  }
}