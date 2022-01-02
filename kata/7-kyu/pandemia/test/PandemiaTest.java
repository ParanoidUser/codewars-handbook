import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PandemiaTest {
  @ParameterizedTest
  @CsvSource({
      "111111X111111X111111X, 100",
      "X1XX, 100",
      "00X0X000X, 0",
      "0, 0",
      "1, 100",
      "01000000X000X011X0X, 73.33333333333333",
      "01X000X010X011XX, 72.72727272727273",
      "XXXXX, 0",
      "0000000010, 100",
      "X00X000000X10X0100, 42.857142857142854"
  })
  void sample(String input, double expected) {
    assertEquals(expected, Pandemia.infected(input), 10e-5);
  }
}