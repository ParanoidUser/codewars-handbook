import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.speedLimit(60, new int[]{80, 70, 60}));
    assertEquals(100, Kata.speedLimit(90, new int[]{80}));
    assertEquals(200, Kata.speedLimit(92, new int[]{90, 110, 90, 80, 100, 100, 80, 90, 110, 110, 100, 100, 90, 100}));
    assertEquals(250, Kata.speedLimit(100, new int[]{110, 100, 80}));
    assertEquals(500, Kata.speedLimit(130, new int[]{140, 130, 100}));
    assertEquals(100, Kata.speedLimit(110, new int[]{120, 110, 100}));
    assertEquals(1500, Kata.speedLimit(220, new int[]{120, 110, 100}));
    assertEquals(850, Kata.speedLimit(100, new int[]{70, 80, 90, 100}));
  }
}