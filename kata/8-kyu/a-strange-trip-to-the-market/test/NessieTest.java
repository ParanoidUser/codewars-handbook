import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NessieTest {
  @Test
  void sample() {
    assertTrue(Nessie.isLockNessMonster("Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
    assertTrue(Nessie.isLockNessMonster("I'm from Scottland. I moved here to be with my family sir. Please, $3.50 would go a long way to help me find them"));
    assertFalse(Nessie.isLockNessMonster("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance."));
  }
}
