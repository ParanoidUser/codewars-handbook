import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StrangeTest {
  @Test
  void sample() {
    assertEquals(4, Strange.mathematics(11, 2));
    assertEquals(11, Strange.mathematics(15, 5));
    assertEquals(7, Strange.mathematics(15, 15));
  }
}
