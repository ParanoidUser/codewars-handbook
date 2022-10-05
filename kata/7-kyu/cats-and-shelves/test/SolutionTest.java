import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource({
      "0, 1, 1",
      "0, 2, 2",
      "1, 1, 2",
      "1, 1, 4",
      "1, 2, 3",
      "1, 2, 5",
      "2, 1, 3",
      "2, 1, 5",
      "2, 1, 7",
      "2, 2, 4",
      "2, 2, 6",
      "2, 2, 8",
      "3, 1, 6",
      "134, 540, 942"
  })
  void sample(int expected, int start, int finish) {
    assertEquals(expected, Kata.solution(start, finish));
  }
}
