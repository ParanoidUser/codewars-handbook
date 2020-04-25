import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Tests {
  @Test
  void sample() {
    assertEquals("hell wrld", Kata.removeO("hello world"));
    assertEquals("bn", Kata.removeO("bono"));
    assertEquals("hw are yu tday?", Kata.removeO("how are you today?"));
  }
}
