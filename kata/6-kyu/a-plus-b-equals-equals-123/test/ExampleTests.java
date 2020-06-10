import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(123, Dinglemouse.int123(0));
    assertEquals(0, Dinglemouse.int123(123));
    assertEquals(4294966919L, Dinglemouse.int123(500));
  }
}
