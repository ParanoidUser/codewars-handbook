import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertTrue(TenMinWalk.isValid(new char[] {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    assertFalse(TenMinWalk.isValid(new char[] {'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    assertFalse(TenMinWalk.isValid(new char[] {'w'}));
    assertFalse(TenMinWalk.isValid(new char[] {'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
  }
}
