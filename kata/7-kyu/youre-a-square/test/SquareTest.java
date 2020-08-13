import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SquareTest {
  @Test
  void sample() {
    assertFalse(Square.isSquare(-1));
    assertTrue(Square.isSquare(0));
    assertFalse(Square.isSquare(3));
    assertTrue(Square.isSquare(4));
    assertTrue(Square.isSquare(25));
    assertFalse(Square.isSquare(26));
  }
}
