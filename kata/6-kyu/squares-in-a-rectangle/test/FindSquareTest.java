import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindSquareTest {
  @Test
  void sample() {
    assertEquals(8, Kata.findSquares(3, 2));
    assertEquals(20, Kata.findSquares(4, 3));
    assertEquals(100, Kata.findSquares(11, 4));
  }
}
