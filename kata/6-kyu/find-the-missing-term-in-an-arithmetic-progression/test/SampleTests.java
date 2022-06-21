import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(3, Solution.findMissing(new int[]{1, 2, 4}));
    assertEquals(2, Solution.findMissing(new int[]{1, 3, 4}));
    assertEquals(3, Solution.findMissing(new int[]{4, 2, 1}));
    assertEquals(2, Solution.findMissing(new int[]{4, 3, 1}));
    assertEquals(1, Solution.findMissing(new int[]{1, 1, 1}));
  }
}