import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GrassHopperTest {
  @Test
  void sample() {
    assertEquals("Hello, Mr. Spock", GrassHopper.sayHello("Mr. Spock"));
    assertEquals("Hello, Captain Kirk", GrassHopper.sayHello("Captain Kirk"));
    assertEquals("Hello, Liutenant Uhura", GrassHopper.sayHello("Liutenant Uhura"));
    assertEquals("Hello, Dr. McCoy", GrassHopper.sayHello("Dr. McCoy"));
  }
}
