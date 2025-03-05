import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Tests {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, Value is 00000
      5, Value is 00005
      109, Value is 00109
      1204, Value is 01204
      """)
  void sample(int n, String expected) {
    assertEquals(expected, Kata.solution(n));
  }
}