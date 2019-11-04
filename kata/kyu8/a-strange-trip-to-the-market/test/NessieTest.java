import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NessieTest {
  @Test
  public void testBasicTrue() {
    assertTrue(Nessie.isLockNessMonster("Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
  }

  @Test
  public void testBasicFalse() {
    assertFalse(Nessie.isLockNessMonster("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance."));
  }
}
