import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KataTests {
  @Test
  public void basicTests() {
    assertTrue(Kata.compare("AD", "BC"));
    assertTrue(Kata.compare("A!D", ""));
    assertFalse(Kata.compare("AD", "DD"));
  }
}
