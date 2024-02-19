import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0, 0, 0
      0, 0, 1, 0
      1, 1, 1, 1
      1, 2, 2, 4
      1, 1, -1, -1
      1, -2, -2, 4
      4, 0, 11, 0
      5, 7, 0, 0
      """)
  void collinear(int x1, int y1, int x2, int y2) {
    assertTrue(Kata.collinearity(x1, y1, x2, y2));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 1, 6, 0
      1, 1, 6, 1
      1, 2, 1, -2
      4, 4, 0, 4
      -9, 171, -574, -214
      """)
  void nonCollinear(int x1, int y1, int x2, int y2) {
    assertFalse(Kata.collinearity(x1, y1, x2, y2));
  }
}