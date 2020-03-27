import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OfficialTest {
  @Test
  public void basicTests() {
    assertTrue(Kata.areTanksInRange(2000, 175, 30));
    assertTrue(Kata.areTanksInRange(2000, 200, 15));
    assertFalse(Kata.areTanksInRange(20000, 175, 30));
    assertTrue(Kata.areTanksInRange(4000, 200, 45));
    assertFalse(Kata.areTanksInRange(1100, 100, 45));
  }
}