import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(16, Dinglemouse.tvRemote("does"));
    assertEquals(23, Dinglemouse.tvRemote("your"));
    assertEquals(33, Dinglemouse.tvRemote("solution"));
    assertEquals(20, Dinglemouse.tvRemote("work"));
    assertEquals(12, Dinglemouse.tvRemote("for"));
    assertEquals(27, Dinglemouse.tvRemote("these"));
    assertEquals(25, Dinglemouse.tvRemote("words"));
    assertEquals(36, Dinglemouse.tvRemote("codewars"));
  }
}
