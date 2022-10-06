import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("aaaaa", Repeater.repeat("a", 5));
    assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa", Repeater.repeat("Na", 16));
    assertEquals("Wub Wub Wub Wub Wub Wub ", Repeater.repeat("Wub ", 6));
  }
}
