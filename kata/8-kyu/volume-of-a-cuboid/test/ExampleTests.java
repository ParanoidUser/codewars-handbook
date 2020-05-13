import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(4, Kata.getVolumeOfCuboid(1, 2, 2), 0.0001);
    assertEquals(63, Kata.getVolumeOfCuboid(6.3, 2, 5), 0.0001);
  }
}
