import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UpsideDownTest {
  @Test
  void sample() {
    assertEquals(3, new UpsideDown().solve(0, 10));
    assertEquals(4, new UpsideDown().solve(10, 100));
    assertEquals(12, new UpsideDown().solve(100, 1000));
    assertEquals(20, new UpsideDown().solve(1000, 10000));
    assertEquals(6, new UpsideDown().solve(10000, 15000));
    assertEquals(9, new UpsideDown().solve(15000, 20000));
    assertEquals(15, new UpsideDown().solve(60000, 70000));
    assertEquals(55, new UpsideDown().solve(60000, 130000));
  }
}
