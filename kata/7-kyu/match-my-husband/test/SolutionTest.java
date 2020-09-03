import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("No match!", Solution.match(new int[]{15, 24, 12}, 4));
    assertEquals("Match!", Solution.match(new int[]{26, 23, 19}, 3));
    assertEquals("No match!", Solution.match(new int[]{11, 25, 36}, 1));
    assertEquals("Match!", Solution.match(new int[]{22, 9, 24}, 5));
    assertEquals("Match!", Solution.match(new int[]{8, 11, 4}, 10));
    assertEquals("No match!", Solution.match(new int[]{17, 31, 21}, 2));
    assertEquals("Match!", Solution.match(new int[]{34, 25, 36}, 1));
    assertEquals("No match!", Solution.match(new int[]{35, 35, 29}, 0));
    assertEquals("Match!", Solution.match(new int[]{35, 35, 30}, 0));
    assertEquals("Match!", Solution.match(new int[]{35, 35, 31}, 0));
  }
}
