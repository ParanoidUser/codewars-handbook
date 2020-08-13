import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LampTest {
  @Test
  void sample() {
    Lamp lamp = new Lamp("Red", "on");
    lamp.setColor("Blue");
    lamp.setState("off");
    assertEquals("Blue", lamp.getColor());
    assertEquals("off", lamp.getState());
  }
}
