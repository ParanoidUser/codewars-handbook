import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      54, 12
      41, 79
      13, 12
      41, 98
      12, 28
      74, 81
      75, 35
      21, 25
      22, 34
      52, 46
      48, 54
      75, 87
      25, 41
      """)
  void win(int p1, int p2) {
    assertTrue(Solution.swapCards(p1, p2));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      15, 19
      67, 53
      77, 54
      45, 23
      24, 12
      88, 45
      48, 14
      """)
  void lose(int p1, int p2) {
    assertFalse(Solution.swapCards(p1, p2));
  }
}