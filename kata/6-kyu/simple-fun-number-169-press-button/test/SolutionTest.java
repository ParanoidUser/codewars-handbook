import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @CsvSource({
      "1, 1",
      "2, 3",
      "3, 7",
      "4, 14"
  })
  @ParameterizedTest
  void sample(int n, int expected) {
    assertEquals(expected, Kata.PressButton(n));
  }
}