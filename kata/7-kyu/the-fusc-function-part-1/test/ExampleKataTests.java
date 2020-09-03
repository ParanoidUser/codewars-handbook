import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleKataTests {
  @Test
  void sample() {
    assertEquals(0, Kata.fusc(0));
    assertEquals(1, Kata.fusc(1));
    assertEquals(21, Kata.fusc(85));
  }
}
