import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void example() {
    assertArrayEquals(new double[] {-.5, -2}, Dinglemouse.cogRpm(new int[] {100, 50, 25}, 1), .001);
    assertArrayEquals(new double[] {.25, 1}, Dinglemouse.cogRpm(new int[] {100, 50, 25}, 2), .001);
    assertArrayEquals(new double[] {-.5, 1}, Dinglemouse.cogRpm(new int[] {100, 50}, 1), .001);
    assertArrayEquals(new double[] {.25, -1}, Dinglemouse.cogRpm(new int[] {100, 50, 25, 25}, 2), .001);
  }
}
