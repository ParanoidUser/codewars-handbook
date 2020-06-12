import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RotationTest {
  @Test
  void sample() {
    assertEquals(2, CalculateRotation.shiftedDiff("coffee", "eecoff"));
    assertEquals(4, CalculateRotation.shiftedDiff("eecoff", "coffee"));
    assertEquals(-1, CalculateRotation.shiftedDiff("hoop", "pooh"));
    assertEquals(-1, CalculateRotation.shiftedDiff("hoop", "oop"));
  }
}
