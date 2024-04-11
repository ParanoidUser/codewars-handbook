import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestRunner {
  @ParameterizedTest
  @CsvSource(textBlock = """
      2600, 20, 80, 5
      2890, 10, 80, 5
      2310, 30, 80, 5
      2020, 40, 80, 5
      1000, 20, 120, 5
      200, 20, 160, 5
      540, 20, 143, 5
      1830, 20, 80, 3.52
      3375, 20, 80, 6.49
      520, 20, 80, 1
      """)
  void sample(int distance, int age, int initialHR, double speed) {
    assertEquals(distance, Kata.getDistance(age, initialHR, speed));
  }
}