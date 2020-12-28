import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class PawnDistanceTest {
  @Test
  void testEquals() {
    var white = new PawnDistance("White", 1);
    assertEquals(white, white);
    assertEquals(white, new PawnDistance("White", 1));
    assertNotEquals(white, new PawnDistance("Black", 1));
    assertNotEquals(white, new PawnDistance("White", 2));
    assertNotEquals(white, new Object());
    assertNotEquals(null, white);
  }

  @Test
  void testHashcode() {
    assertEquals(-1704941336, new PawnDistance("White", 16).hashCode());
    assertEquals(1992253390, new PawnDistance("Black", 12).hashCode());
  }
}