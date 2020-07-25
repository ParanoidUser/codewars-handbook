import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StairTests {
  @Test
  void sample() {
    assertEquals(6, Stairs.NumberOfSteps(10, 2));
    assertEquals(-1, Stairs.NumberOfSteps(3, 5));
  }
}
