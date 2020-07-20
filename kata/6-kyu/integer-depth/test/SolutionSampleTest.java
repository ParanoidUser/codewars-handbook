import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionSampleTest {
  @Test
  void sample() {
    assertEquals(10, MySolution.computeDepth(1));
    assertEquals(9, MySolution.computeDepth(42));
  }
}
