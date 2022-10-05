import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTests {
  @ParameterizedTest(name = "number1 = [{1},{2}], number2 = [{3},{4}]")
  @CsvSource(textBlock = """
       1, 2, 10, 2, 15
       1, 2, 10, 3, 10
       0, 2, 10, 2, 10
      -1, 3,  9, 5,  6
      -1, 7,  7, 5,  8
      """)
  void sample(int expected, int base1, int exp1, int base2, int exp2) {
    assertEquals(expected, Compare.comparePowers(new int[]{base1, exp1}, new int[]{base2, exp2}));
  }
}

