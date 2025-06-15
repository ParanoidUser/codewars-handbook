import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      10, 2
      21, 3
      """)
  void sample(int n, int expected) {
    assertEquals(expected, HammingWeight.hammingWeight(n));
  }
}