import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SystemTests {
  @Test
  void sample() {
    assertEquals(1, SystemOfEq.Solution(9, 3));
    assertEquals(1, SystemOfEq.Solution(14, 28));
    assertEquals(0, SystemOfEq.Solution(4, 20));
  }
}