import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(0, Dinglemouse.kookaCounter(""));
    assertEquals(1, Dinglemouse.kookaCounter("hahahahaha"));
    assertEquals(2, Dinglemouse.kookaCounter("hahahahahaHaHaHa"));
    assertEquals(3, Dinglemouse.kookaCounter("HaHaHahahaHaHa"));
  }
}
