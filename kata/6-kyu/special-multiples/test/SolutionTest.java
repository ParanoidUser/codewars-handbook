import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
   void sample() {
    assertEquals(16, CountMultiples.countSpecMult(2, 100));
    assertEquals(6, CountMultiples.countSpecMult(3, 200));
    assertEquals(0, CountMultiples.countSpecMult(4, 100));
  }
}
