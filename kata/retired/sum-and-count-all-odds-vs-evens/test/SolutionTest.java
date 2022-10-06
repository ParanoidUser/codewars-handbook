import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, ProcessNumbers.processNumbers(new int[]{1, 3, 7})[0]);
    assertEquals(256, ProcessNumbers.processNumbers(new int[]{1, 2, 3, 7, 6, -4, 0})[0]);
    assertEquals(1331, ProcessNumbers.processNumbers(new int[]{1, 2, 3, 7, 6, -4, 0})[1]);
    assertEquals(0, ProcessNumbers.processNumbers(null)[1]);
  }
}
