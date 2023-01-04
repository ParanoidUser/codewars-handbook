import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ThinkingAndTestingTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
          0,0
          1,1
          2,1
          3,2
          4,1
          5,2
          6,2
          7,3
          8,1
          9,2
         10,2
        100,3
       1000,6
      10000,5
      """)
  void sample(int n, int expected) {
    assertEquals(expected, ThinkingAndTesting.testTrueFalse(n));
  }
}
