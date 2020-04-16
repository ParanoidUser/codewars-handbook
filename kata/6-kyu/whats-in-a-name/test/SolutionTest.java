import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTest() {
    assertTrue(Kata.nameInStr("Across the rivers", "chris"));
    assertFalse(Kata.nameInStr("Next to a lake", "chris"));
    assertFalse(Kata.nameInStr("Under a sea", "chris"));
    assertFalse(Kata.nameInStr("A crew that boards the ship", "chris"));
    assertFalse(Kata.nameInStr("A live son", "Allison"));
  }
}
