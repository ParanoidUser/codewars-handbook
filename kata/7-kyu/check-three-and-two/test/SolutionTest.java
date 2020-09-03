import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(new Solution().checkThreeAndTwo(new char[]{'a', 'a', 'b', 'b', 'b'}));
    assertFalse(new Solution().checkThreeAndTwo(new char[]{'a', 'c', 'a', 'c', 'b'}));
    assertFalse(new Solution().checkThreeAndTwo(new char[]{'a', 'a', 'a', 'a', 'a'}));
  }
}
