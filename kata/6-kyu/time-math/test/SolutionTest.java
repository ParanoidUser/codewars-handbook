import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      01:24:31, 02:16:05, 03:40:36
      01:24:31, 22:35:28, 23:59:59
      00:00:01, 23:59:59, 00:00:00
      13:48:52, 13:47:53, 03:36:45
      """)
  void add(String time1, String time2, String result) {
    assertEquals(result, Solution.timeMath(time1, "+", time2));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      11:24:31, 11:24:31, 00:00:00
      11:24:31, 03:15:28, 08:09:03
      00:00:01, 00:00:02, 23:59:59
      """)
  void subtract(String time1, String time2, String result) {
    assertEquals(result, Solution.timeMath(time1, "-", time2));
  }
}