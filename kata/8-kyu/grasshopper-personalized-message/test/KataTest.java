import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("Hello boss", Kata.greet("Daniel", "Daniel"));
    assertEquals("Hello guest", Kata.greet("Greg", "Daniel"));
  }
}
