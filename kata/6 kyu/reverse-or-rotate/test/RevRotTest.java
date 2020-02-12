import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RevRotTest {
  @Test
  public void test() {
    assertTrue(RevRot.revRot("1234", 0).isEmpty());
    assertTrue(RevRot.revRot("", 0).isEmpty());
    assertTrue(RevRot.revRot("1234", 5).isEmpty());
    assertEquals("330479108928157", RevRot.revRot("733049910872815764", 5));
  }
}
