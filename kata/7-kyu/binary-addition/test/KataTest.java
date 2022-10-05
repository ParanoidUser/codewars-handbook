import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KataTest {
  @ParameterizedTest
  @CsvSource({
      "10, 1, 1",
      "1, 0, 1",
      "1, 1, 0",
      "100, 2, 2",
      "111111, 51, 12"
  })
  void sample(String expected, int a, int b) {
    assertEquals(expected, Kata.binaryAddition(a, b));
  }
}