import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
    assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
  }
}
