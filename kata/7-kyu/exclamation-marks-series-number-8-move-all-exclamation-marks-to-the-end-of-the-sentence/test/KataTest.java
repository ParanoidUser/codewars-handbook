import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
  @Test
  void sample() {
    assertEquals("Hi!", Kata.remove("Hi!"));
    assertEquals("Hi Hi!!", Kata.remove("Hi! Hi!"));
    assertEquals("Hi Hi Hi!!!", Kata.remove("Hi! Hi! Hi!"));
    assertEquals("Hi Hi Hi!!!", Kata.remove("Hi! !Hi Hi!"));
    assertEquals("Hi Hi Hi!!!!", Kata.remove("Hi! Hi!! Hi!"));
  }
}