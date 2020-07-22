import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(12, Dinglemouse.zigZagCamel(9, 6), 0.00001);
    assertEquals(11.18033988749895, Dinglemouse.zigZagCamel(10, 5), 0.00001);
  }
}