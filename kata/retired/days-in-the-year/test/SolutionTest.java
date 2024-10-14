import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       -64, -64 has 366 days
       -10, -10 has 365 days
         0, 0 has 366 days
      1974, 1974 has 365 days
      """)
  void sample(int year, String prompt) {
    assertEquals(prompt, DaysInAYear.daysInTheYear(year));
  }
}