import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RobotTest {
  @Test
  void sample() {
    assertEquals("ammE", new Robot().reverse("Emma"));
  }
} 