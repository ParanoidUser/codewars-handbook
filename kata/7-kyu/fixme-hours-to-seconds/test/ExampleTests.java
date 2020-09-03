import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(0, Dinglemouse.hoursToSeconds(0));
    assertEquals(3600, Dinglemouse.hoursToSeconds(1));
    assertEquals(7200, Dinglemouse.hoursToSeconds(2));
    assertEquals(10800, Dinglemouse.hoursToSeconds(3));
    assertEquals(86400, Dinglemouse.hoursToSeconds(24));
  }
}
