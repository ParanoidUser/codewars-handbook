import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTests {
  @ParameterizedTest
  @CsvSource(delimiter = '|', textBlock = """
      Give me 5! | 73
      Give me five! | 110
      oops, i did it again! | 152
      I Love You | 170
      ILoveYou | 170
      ARE YOU HUNGRY? | 356
      """)
  void sample(String input, int expected) {
    assertEquals(expected, SentenceCalculator.lettersToNumbers(input));
  }
}