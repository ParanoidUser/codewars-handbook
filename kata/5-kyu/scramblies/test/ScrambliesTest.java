import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ScrambliesTest {
  @Test
  void sample() {
    assertTrue(Scramblies.scramble("rkqodlw", "world"));
    assertTrue(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
    assertFalse(Scramblies.scramble("katas", "steak"));
    assertFalse(Scramblies.scramble("scriptjavx", "javascript"));
    assertTrue(Scramblies.scramble("scriptingjava", "javascript"));
    assertTrue(Scramblies.scramble("scriptsjava", "javascripts"));
    assertFalse(Scramblies.scramble("javscripts", "javascript"));
    assertTrue(Scramblies.scramble("aabbcamaomsccdd", "commas"));
    assertTrue(Scramblies.scramble("commas", "commas"));
    assertTrue(Scramblies.scramble("sammoc", "commas"));
  }
}