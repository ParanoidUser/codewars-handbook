import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, BeadsCounter.countRedBeads(0));
    assertEquals(0, BeadsCounter.countRedBeads(1));
    assertEquals(4, BeadsCounter.countRedBeads(3));
    assertEquals(8, BeadsCounter.countRedBeads(5));
  }
}
