import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThirdAngleTest {
  @Test
  void sample() {
    assertEquals(123, ThirdAngle.otherAngle(45, 12));
    assertEquals(70, ThirdAngle.otherAngle(50, 60));
  }
}
