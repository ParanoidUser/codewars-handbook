import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MangoTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      3, 3, 6
      9, 5, 30
      467, 571, 178152
      566, 9498, 3590244
      """)
  void sample(int q, int p, int expected) {
    assertEquals(expected, Mango.mango(q, p));
  }
}