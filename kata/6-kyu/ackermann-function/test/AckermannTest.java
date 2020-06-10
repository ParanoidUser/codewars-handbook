import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AckermannTest {
  @Test
  void sample() {
    assertEquals(3, Solution.Ackermann(1, 1));
    assertEquals(13, Solution.Ackermann(4, 0));
    assertEquals(5, Solution.Ackermann(0, 4));
  }
}
