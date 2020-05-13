import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Welcome", Welcome.greet("english"));
    assertEquals("Welkom", Welcome.greet("dutch"));
    assertEquals("Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
  }
}
