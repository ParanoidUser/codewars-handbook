import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
              1,       1,   2
              1,       3,   5
              2,     -10, 100
              3,      -1,  -9
              4,      19, -56
          """)
  void sample(int expected, int x, int y) {
    assertEquals(expected, Kata.quadrant(x, y));
  }
}