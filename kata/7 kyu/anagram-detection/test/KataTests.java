import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KataTests {
  @Test
  public void exampleTests() {
    assertTrue(Kata.isAnagram("foefet", "toffee"));
    assertTrue(Kata.isAnagram("Buckethead", "DeathCubeK"));
    assertTrue(Kata.isAnagram("Twoo", "Woot"));
    assertFalse(Kata.isAnagram("apple", "pale"));
  }
}
