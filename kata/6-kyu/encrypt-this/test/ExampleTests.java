import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("", Kata.encryptThis(""));
    assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", Kata.encryptThis("A wise old owl lived in an oak"));
    assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", Kata.encryptThis("Thank you Piotr for all your help"));
    assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", Kata.encryptThis("The more he saw the less he spoke"));
    assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", Kata.encryptThis("The less he spoke the more he heard"));
    assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", Kata.encryptThis("Why can we not all be like that wise old bird"));
  }
}
