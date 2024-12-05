import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @CsvSource(textBlock = """
      #     n    f    m
            0,   1,   0
            5,   3,   3
           10,   6,   6
           15,   9,   9
           25,  16,  16
      """)
  @ParameterizedTest
  void sample(int n, int expectedF, int expectedM) {
    assertEquals(expectedF, MutualRecursion.f(n));
    assertEquals(expectedM, MutualRecursion.m(n));
  }
}