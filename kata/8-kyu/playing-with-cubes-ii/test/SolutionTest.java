import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void constructor() {
    assertEquals(0, new Cube().getSide());
    assertEquals(6, new Cube(6).getSide());
    assertEquals(3, new Cube(-3).getSide());
  }

  @Test
  void positiveSide() {
    Cube c = new Cube();
    c.setSide(3);
    assertEquals(3, c.getSide());
  }

  @Test
  void zeroSide() {
    Cube c = new Cube(42);
    c.setSide(0);
    assertEquals(0, c.getSide());
  }

  @Test
  void negativeSide() {
    Cube c = new Cube(-42);
    c.setSide(-1337);
    assertEquals(1337, c.getSide());
  }
}