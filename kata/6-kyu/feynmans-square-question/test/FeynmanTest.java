import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FeynmanTest {
  @Test
  void sample() {
    assertEquals(1, FeynmanSquare.countSquares(1));
    assertEquals(5, FeynmanSquare.countSquares(2));
    assertEquals(55, FeynmanSquare.countSquares(5));
    assertEquals(1240, FeynmanSquare.countSquares(15));
  }
}