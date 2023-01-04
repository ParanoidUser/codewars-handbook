import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PerpendicularTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
          0,0
          1,0
          2,1
          3,2
          4,4
          5,6
          6,9
         51,650
      """)
  void sample(int n, int expected) {
    assertEquals(expected, Perpendicular.maxBisectors(n));
  }
}