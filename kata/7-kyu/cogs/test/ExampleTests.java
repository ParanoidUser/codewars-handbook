import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(-1.333, Dinglemouse.cogRpm(new int[] {100, 75}), 0.001);
    assertEquals(4, Dinglemouse.cogRpm(new int[] {100, 75, 25}), 0.001);
  }
}
