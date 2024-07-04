import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SimpleMathTests {
  @ParameterizedTest
  @CsvSource(textBlock = """
      -10, false, true, true
      -2, false, true, false
      0, false, true, true
      1, false, false, false
      2, true, true, false
      120, false, true, true
      125, false, false, false
      139, true, false, false
      341, false, false, false
      """)
  void sample(int n, boolean prime, boolean even, boolean decimal) {
    assertArrayEquals(new boolean[]{prime, even, decimal}, SimpleMath.numberProperty(n));
  }
}