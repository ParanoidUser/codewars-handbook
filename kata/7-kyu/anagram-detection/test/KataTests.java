import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertTrue(Kata.isAnagram("foefet", "toffee"));
    assertTrue(Kata.isAnagram("Buckethead", "DeathCubeK"));
    assertTrue(Kata.isAnagram("Twoo", "Woot"));
    assertFalse(Kata.isAnagram("apple", "pale"));
    assertFalse(Kata.isAnagram("apple", "appl"));
  }
}
