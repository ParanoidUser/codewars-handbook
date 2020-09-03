import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareDigitTest {
  @Test
  void sample() {
    assertEquals(811181, new SquareDigit().squareDigits(9119));
  }
}
