import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
  @Test
  void sample() {
    assertEquals("", Kata.makePassword(""));
    assertEquals("KCaC0", Kata.makePassword("Keep Calm and Carry On"));
    assertEquals("Gml0gmd", Kata.makePassword("Give me liberty or give me death"));
  }
}