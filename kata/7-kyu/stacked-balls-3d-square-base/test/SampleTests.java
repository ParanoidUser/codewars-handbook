import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(0, Dinglemouse.stackHeight3d(0), .001);
    assertEquals(1., Dinglemouse.stackHeight3d(1), .001);
    assertEquals(1.7071, Dinglemouse.stackHeight3d(2), .001);
  }
}
