import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CipherTests {
  @Test
  void encodeBasicTests() {
    assertEquals("csordaew", Kata.encode("codewars"));
    assertEquals("wehti", Kata.encode("white"));
    assertEquals("Atsrse", Kata.encode("Assert"));
    assertEquals("H!edlllroo w", Kata.encode("Hello world!"));
    assertEquals("Y.oaut ahka vsei hcth oesteanl stnoa rt", Kata.encode("You have chosen to translate this kata."));
  }

  @Test
  void decodeBasicTests() {
    assertEquals("codewars", Kata.decode("csordaew"));
    assertEquals("white", Kata.decode("wehti"));
    assertEquals("Assert", Kata.decode("Atsrse"));
    assertEquals("Hello world!", Kata.decode("H!edlllroo w"));
    assertEquals("You have chosen to translate this kata.", Kata.decode("Y.oaut ahka vsei hcth oesteanl stnoa rt"));
  }
}