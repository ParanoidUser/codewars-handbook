import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareDigitTest {
  @Test
  void sample() {
    assertEquals(0, new SquareDigit().squareDigits(0));
    assertEquals(4114, new SquareDigit().squareDigits(2112));
    assertEquals(9414, new SquareDigit().squareDigits(3212));
    assertEquals(811181, new SquareDigit().squareDigits(9119));
  }
}
