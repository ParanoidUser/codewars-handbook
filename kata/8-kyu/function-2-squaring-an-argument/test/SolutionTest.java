import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       1, 1
       2, 4
      50, 2500
      """)
  void sample(int n, int expected) {
    assertEquals(expected, Kata.square(n));
  }
}
