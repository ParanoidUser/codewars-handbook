import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RedKnightTest {
  @Test
  void sample() {
    assertEquals(new PawnDistance("White", 16), CodeWars.redKnight(0, 8));
    assertEquals(new PawnDistance("Black", 14), CodeWars.redKnight(0, 7));
    assertEquals(new PawnDistance("Black", 12), CodeWars.redKnight(1, 6));
    assertEquals(new PawnDistance("White", 10), CodeWars.redKnight(1, 5));
  }
}