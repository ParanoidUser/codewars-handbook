import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LucasTest {
  @Test
  void sample() {
    assertEquals(2, Lucas.lucasnum(0));
    assertEquals(1, Lucas.lucasnum(1));
    assertEquals(3, Lucas.lucasnum(2));
    assertEquals(-11, Lucas.lucasnum(-5));
    assertEquals(123, Lucas.lucasnum(-10));
  }
}
