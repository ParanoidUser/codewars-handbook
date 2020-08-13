import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareRootOfTwoTest {
  @Test
  void sample() {
    assertEquals("1.0000000000", new SquareRootOfTwo().calculate(0));
    assertEquals("1.5000000000", new SquareRootOfTwo().calculate(1));
    assertEquals("1.4142857143", new SquareRootOfTwo().calculate(5));
  }
}
