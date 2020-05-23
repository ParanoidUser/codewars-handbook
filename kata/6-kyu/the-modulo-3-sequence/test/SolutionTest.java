import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(2, Solution.sequence(20));
    assertEquals(0, Solution.sequence(41));
    assertEquals(1, Solution.sequence(72));
    assertEquals(1, Solution.sequence(82));
    assertEquals(0, Solution.sequence(85));
    assertEquals(1, Solution.sequence(90));
    assertEquals(2, Solution.sequence(111));
    assertEquals(0, Solution.sequence(117));
    assertEquals(2, Solution.sequence(118));
    assertEquals(2, Solution.sequence(148));
    assertEquals(1, Solution.sequence(163));
    assertEquals(1, Solution.sequence(5101394));
  }
}