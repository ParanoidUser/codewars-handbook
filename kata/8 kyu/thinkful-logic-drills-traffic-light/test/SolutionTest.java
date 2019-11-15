import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void update_light() {
    assertEquals("green", TrafficLights.updateLight("red"));
    assertEquals("yellow", TrafficLights.updateLight("green"));
    assertEquals("red", TrafficLights.updateLight("yellow"));
  }
}
