import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertTrue(new Kata().isAnagram("foefet", "toffee"));
    assertTrue(new Kata().isAnagram("Buckethead", "DeathCubeK"));
    assertTrue(new Kata().isAnagram("Twoo", "Woot"));
    assertFalse(new Kata().isAnagram("apple", "pale"));
    assertFalse(new Kata().isAnagram("apple", "appl"));
  }
}
