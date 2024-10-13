import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LatestClockTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0, 0, 0, 00:00
      4, 0, 5, 0, 05:40
      1, 9, 8, 3, 19:38
      9, 1, 2, 5, 21:59
      5, 2, 3, 9, 23:59
      """)
  void sample(int a, int b, int c, int d, String time) {
    assertEquals(time, Kata.latestClock(a, b, c, d));
  }
}