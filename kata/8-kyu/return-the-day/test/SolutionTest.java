import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(delimiter = '|', textBlock = """
       0 | Wrong, please enter a number between 1 and 7
       1 | Sunday
       2 | Monday
       3 | Tuesday
       4 | Wednesday
       5 | Thursday
       6 | Friday
       7 | Saturday
       8 | Wrong, please enter a number between 1 and 7
      99 | Wrong, please enter a number between 1 and 7
       """)
  void sample(int n, String expected) {
    assertEquals(expected, DayOfWeek.getDay(n));
  }
}
