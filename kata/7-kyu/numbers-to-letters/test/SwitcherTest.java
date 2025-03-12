import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SwitcherTest {
  @ParameterizedTest
  @CsvSource(delimiter = '|', textBlock = """
      12 | o
      4,24 | wc
      24,12,23,22,4,26,9,8 | codewars
      25,7,8,4,14,23,8,25,23,29,16,16,4 | btswmdsbd kkw
      12,28,25,21,25,7,11,22,15 | o?bfbtpel
      """)
  void sample(String arr, String expected) {
    assertEquals(expected, Kata.switcher(arr.split(",")));
  }
}