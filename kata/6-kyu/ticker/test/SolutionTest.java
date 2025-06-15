import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      10, 0, '          '
      10, 5, '     Beaut'
      10, 30, 'than ugly.'
      10, 39, '.         '
      10, 41, '         B'
      """)
  void sample(int width, int tick, String display) {
    assertEquals(display, Kata.ticker("Beautiful is better than ugly.", width, tick));
  }
}