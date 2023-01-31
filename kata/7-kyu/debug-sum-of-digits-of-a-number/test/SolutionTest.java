import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
         1,1
       100,1
       123,6
       291,12
      9999,36
       """)
  void sample(int n, int expected) {
    assertEquals(expected, Solution.sumOfDigits(n));
  }
}
