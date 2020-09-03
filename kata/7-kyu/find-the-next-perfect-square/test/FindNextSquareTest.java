import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindNextSquareTest {
  @Test
  void sample() {
    assertEquals(144, NumberFun.findNextSquare(121));
    assertEquals(676, NumberFun.findNextSquare(625));
    assertEquals(-1, NumberFun.findNextSquare(114));
  }
}
