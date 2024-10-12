import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTests {
  @ParameterizedTest
  @CsvSource(textBlock = """
      12385, 3, 13824
      1245678, 5, 1419857
      1245678, 6, 1771561
      """)
  void sample(int val, int pow, int expected) {
    assertEquals(expected, Kata.findNextPower(val, pow));
  }
}