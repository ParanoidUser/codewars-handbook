import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("green", TrafficLights.updateLight("red"));
    assertEquals("yellow", TrafficLights.updateLight("green"));
    assertEquals("red", TrafficLights.updateLight("yellow"));
  }
}
