import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DinglemouseTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1965, 9, 4, 0, 0
      1964, 11, 28, 0, 11
      1965, 12, 11, 111, 0
      1950, 1, 19, 2645, 1162
      1880, 3, 1, 0, 3909
      """)
  void sample(int y, int m, int d, int cafe, int decaf) {
    assertArrayEquals(new int[]{cafe, decaf}, Dinglemouse.coffeeLimits(y, m, d));
  }
}