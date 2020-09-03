import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(100, MostDigits.findLongest(new int[]{1, 10, 100}));
    assertEquals(9000, MostDigits.findLongest(new int[]{9000, 8, 800}));
    assertEquals(900, MostDigits.findLongest(new int[]{8, 900, 500}));
    assertEquals(40000, MostDigits.findLongest(new int[]{3, 40000, 100}));
    assertEquals(100000, MostDigits.findLongest(new int[]{1, 200, 100000}));
    assertEquals(-10, MostDigits.findLongest(new int[]{-10, 1, 0, 1, 10}));
  }
}
