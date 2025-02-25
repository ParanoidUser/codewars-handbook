import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       10, 1
       99, 18
      -32, 5
      """)
  void sample(int number, int expected) {
    assertEquals(expected, Kata.sumDigits(number));
  }
}