import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("HEllOWOrld!", Kata.swap("HelloWorld!"));
    assertEquals("SUndAy", Kata.swap("Sunday"));
  }
}
