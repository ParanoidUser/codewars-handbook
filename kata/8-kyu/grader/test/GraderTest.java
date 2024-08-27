import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GraderTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       1.1, F
         1, A
       0.9, A
      0.81, B
       0.7, C
       0.6, D
      0.49, F
      """)
  void sample(double score, String grade) {
    assertEquals(grade, Grader.grader(score));
  }
} 