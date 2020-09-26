import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertTrue(Kata.primeString("abac"));
    assertFalse(Kata.primeString("abab"));
    assertFalse(Kata.primeString("aaaa"));
    assertTrue(Kata.primeString("x"));
    assertTrue(Kata.primeString("abc"));
    assertFalse(Kata.primeString("fdsyffdsyffdsyffdsyffdsyf"));
    assertTrue(Kata.primeString("utdutdtdutd"));
    assertTrue(Kata.primeString("abba"));
  }
}