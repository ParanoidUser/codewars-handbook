import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("1 sheep...", Kata.countingSheep(1));
    assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
    assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
  }
}
