import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void ex1() {
    assertTrue(Dinglemouse.same("abc", "abc"));
  }

  @Test
  void ex2() {
    assertFalse(Dinglemouse.same("abc", "def"));
  }
}