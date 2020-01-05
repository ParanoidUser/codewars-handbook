import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IdentifierCheckerTest {
  @Test
  public void testValid() {
    assertTrue(IdentifierChecker.isValid("okay_ok1"));
  }

  @Test
  public void testInvalid() {
    assertFalse(IdentifierChecker.isValid("1i"));
  }
}
