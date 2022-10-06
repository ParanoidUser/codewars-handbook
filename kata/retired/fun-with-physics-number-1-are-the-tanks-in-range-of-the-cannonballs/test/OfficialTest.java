import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OfficialTest {
  @Test
  void basicTests() {
    assertTrue(Kata.areTanksInRange(2000, 175, 30));
    assertTrue(Kata.areTanksInRange(2000, 200, 15));
    assertFalse(Kata.areTanksInRange(20000, 175, 30));
    assertTrue(Kata.areTanksInRange(4000, 200, 45));
    assertFalse(Kata.areTanksInRange(1100, 100, 45));
  }
}