import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SixToastTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      15, 9
      6 ,0
      3, 3
      """)
  void sample(int num, int expected) {
    assertEquals(expected, Kata.sixToast(num));
  }
}