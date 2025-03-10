import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PerimeterSequenceTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1, 1, 4
      1, 2, 8
      1, 3, 12
      """)
  void sample(int a, int n, int p) {
    assertEquals(p, Kata.perimeterSequence(a, n));
  }
}