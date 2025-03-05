import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      www.codewars.com#about, www.codewars.com
      www.codewars.com/katas/?page=1#about, www.codewars.com/katas/?page=1
      www.codewars.com/katas/, www.codewars.com/katas/
      https://example.com#section1, https://example.com
      """)
  void sample(String url, String expected) {
    assertEquals(expected, Kata.removeUrlAnchor(url));
  }
}