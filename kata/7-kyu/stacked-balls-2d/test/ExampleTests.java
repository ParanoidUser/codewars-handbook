import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(0, Dinglemouse.stackHeight2d(0), .001);
    assertEquals(1., Dinglemouse.stackHeight2d(1), .001);
    assertEquals(1.866, Dinglemouse.stackHeight2d(2), .001);
  }
}
