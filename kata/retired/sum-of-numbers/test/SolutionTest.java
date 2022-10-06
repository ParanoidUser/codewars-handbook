import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.findWays(27, 0));
    assertEquals(0, Kata.findWays(12909, 0));
    assertEquals(1, Kata.findWays(6, 1));
    assertEquals(21, Kata.findWays(5, 3));
    assertEquals(42504, Kata.findWays(19, 6));
    assertEquals(51021117810L, Kata.findWays(17, 23));
    assertEquals(37711260989L, Kata.findWays(23, 17));
    assertEquals(59132290782430720L, Kata.findWays(30, 30));
    assertEquals(1388818294740297472L, Kata.findWays(35, 30));
  }
}
