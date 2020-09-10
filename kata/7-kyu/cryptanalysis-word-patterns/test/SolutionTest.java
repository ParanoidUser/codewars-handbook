import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("0.1.2.2.3", Crypto.wordPattern("hello"));
    assertEquals("0.1.2.2.3", Crypto.wordPattern("heLlo"));
    assertEquals("0.1.2.2.3", Crypto.wordPattern("helLo"));
    assertEquals("0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13", Crypto.wordPattern("Hippopotomonstrosesquippedaliophobia"));
  }
}
