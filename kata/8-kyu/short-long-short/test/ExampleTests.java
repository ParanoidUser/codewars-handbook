import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExampleTests {
  @ParameterizedTest
  @CsvSource(textBlock = """
      a, bb, abba
      aa, b, baab
      '', aa, aa
      bb, '', bb
      """)
  void sample(String a, String b, String expected) {
    assertEquals(expected, ShortLongShort.solution(a, b));
  }
}