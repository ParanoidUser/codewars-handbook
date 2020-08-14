import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CircleTest {
  @Test
  void sample() {
    assertThrows(IllegalArgumentException.class, () -> Circle.area(0));
    assertEquals(28.27D, Circle.area(3.), 0.01);
  }
}
