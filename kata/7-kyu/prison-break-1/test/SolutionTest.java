import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.freedPrisoners(new Boolean[]{true, true, true}));
    assertEquals(0, Solution.freedPrisoners(new Boolean[]{false, false, false}));
    assertEquals(0, Solution.freedPrisoners(new Boolean[]{false, true, true, true}));
    assertEquals(6, Solution.freedPrisoners(new Boolean[]{true, false, true, false, true, false}));
    assertEquals(2, Solution.freedPrisoners(new Boolean[]{true, true, true, false, false, false}));
    assertEquals(4, Solution.freedPrisoners(new Boolean[]{true, true, false, false, false, true, false}));
    assertEquals(2, Solution.freedPrisoners(new Boolean[]{true, false, false, false, false, false, false}));
  }
}