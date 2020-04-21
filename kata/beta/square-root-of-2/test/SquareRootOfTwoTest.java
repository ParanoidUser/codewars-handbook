import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareRootOfTwoTest {
  @Test
  void shouldCalculateZeroRepetitions() {
    assertEquals("1.0000000000", SquareRootOfTwo.calculate(0));
  }

  @Test
  void shouldCalculateOneRepetition() {
    assertEquals("1.5000000000", SquareRootOfTwo.calculate(1));
  }

  @Test
  void shouldCalculateFiveRepetitions() {
    assertEquals("1.4142857143", SquareRootOfTwo.calculate(5));
  }
}
