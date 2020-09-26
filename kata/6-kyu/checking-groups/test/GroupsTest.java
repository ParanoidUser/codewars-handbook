import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GroupsTest {
  @Test
  void sample() {
    assertTrue(Groups.groupCheck("()"));
    assertFalse(Groups.groupCheck("({"));
  }
}
