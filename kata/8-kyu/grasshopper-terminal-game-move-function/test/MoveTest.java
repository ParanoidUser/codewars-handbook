import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MoveTest {
  @Test
  void sample() {
    assertEquals(8, Move.move(0, 4));
    assertEquals(15, Move.move(3, 6));
    assertEquals(12, Move.move(2, 5));
  }
}
