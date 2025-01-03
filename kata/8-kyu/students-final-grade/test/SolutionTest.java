import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       99, 1, 100
       80, 11, 100
       76, 5, 90
       76, 4, 75
       52, 1, 0
       33, 4, 0
      """)
  void sample(int exam, int projects, int grade) {
    assertEquals(grade, StudentFinalGrade.finalGrade(exam, projects));
  }
}