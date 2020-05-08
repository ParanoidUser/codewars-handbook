import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GhostCodeTest {
  @Test
  void sample() {
    assertEquals("Hello my name is Javatlacati", GhostCode.helloName("Javatlacati"));
    assertEquals("Hello world!", GhostCode.helloName(""));
    assertEquals("Hello world!", GhostCode.helloName(null));
  }
}
