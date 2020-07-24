import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.nameInStr("Across the rivers", "chris"));
    assertFalse(Kata.nameInStr("Next to a lake", "chris"));
    assertFalse(Kata.nameInStr("Under a sea", "chris"));
    assertFalse(Kata.nameInStr("A crew that boards the ship", "chris"));
    assertFalse(Kata.nameInStr("A live son", "Allison"));
  }
}
