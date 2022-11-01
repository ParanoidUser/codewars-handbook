import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleSumTests {
  @ParameterizedTest
  @CsvSource(textBlock = """
          0, 1
          1, 7
          2, 22
          3, 50
      """)
  void sample(int n, long expected) {
    assertEquals(expected, TriangleSum.getSum(n));
  }
}