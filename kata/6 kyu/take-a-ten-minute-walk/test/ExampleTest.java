import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExampleTest {
  @Test
  public void test() {
    assertTrue(TenMinWalk.isValid(new char[] {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    assertFalse(TenMinWalk.isValid(new char[] {'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    assertFalse(TenMinWalk.isValid(new char[] {'w'}));
    assertFalse(TenMinWalk.isValid(new char[] {'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
  }
}
