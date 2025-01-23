import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GrayCodeTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      2, 0, 00
      2, 1, 11
      3, 0, 000
      3, 1, 011
      3, 2, 101
      3, 3, 110
      4, 5, 1010
      5, 8, 10001
      10, 230, 0111001101
      20, 17, 00000000000000100010
      """)
  void sample(int size, int position, String code) {
    assertEquals(code, GrayCode.evenGrayCode(size, position));
  }
}