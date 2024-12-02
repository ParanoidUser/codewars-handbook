import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestElevator {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0, 0, right
      0, 1, 0, left
      0, 2, 0, left
      """)
  void sample(int left, int right, int call, String expected) {
    assertEquals(expected, Elevator.call(left, right, call));
  }
}