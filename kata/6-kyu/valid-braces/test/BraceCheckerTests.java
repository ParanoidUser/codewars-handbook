import static org.junit.Assert.*;
import org.junit.Test;

public class BraceCheckerTests {
  @Test
  public void testValid() {
    assertTrue(BraceChecker.isValid("()"));
  }

  @Test
  public void testInvalid() {
    assertFalse(BraceChecker.isValid("[(])"));
  }
}
