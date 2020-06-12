import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("12:00", Dinglemouse.whatTimeIsIt(0));
    assertEquals("12:00", Dinglemouse.whatTimeIsIt(360));
    assertEquals("03:00", Dinglemouse.whatTimeIsIt(90));
    assertEquals("06:00", Dinglemouse.whatTimeIsIt(180));
    assertEquals("09:00", Dinglemouse.whatTimeIsIt(270));
  }
}
