import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UpsideDownTest {
  @Test
  void sample() {
    assertEquals(3, UpsideDown.solve(0, 10));
    assertEquals(4, UpsideDown.solve(10, 100));
    assertEquals(12, UpsideDown.solve(100, 1000));
    assertEquals(20, UpsideDown.solve(1000, 10000));
    assertEquals(6, UpsideDown.solve(10000, 15000));
    assertEquals(9, UpsideDown.solve(15000, 20000));
    assertEquals(15, UpsideDown.solve(60000, 70000));
    assertEquals(55, UpsideDown.solve(60000, 130000));
  }
}
