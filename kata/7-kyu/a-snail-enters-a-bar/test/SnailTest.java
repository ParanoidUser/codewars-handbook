import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SnailTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      10, 2, 1
      100, 10, 5
      50, 5, 1
      1000, 100, 10
      1, 0.1, 0.01
      """)
  void madeIt(double length, double speed, double lengthIncreases) {
    assertTrue(Snail.canSnailReachEnd(length, speed, lengthIncreases));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      100, 1, 2
      100000, 0.1, 0.05
      100, 0.5, 1
      1000, 1, 2
      500, 5, 10
      10000, 0.1, 1
      65523.45, 656330.6, 832119.73
      """)
  void notMakeIt(double length, double speed, double lengthIncreases) {
    assertFalse(Snail.canSnailReachEnd(length, speed, lengthIncreases));
  }
}