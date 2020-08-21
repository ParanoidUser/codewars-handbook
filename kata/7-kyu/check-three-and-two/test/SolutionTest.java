import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.checkThreeAndTwo(new char[]{'a', 'a', 'b', 'b', 'b'}));
    assertFalse(Solution.checkThreeAndTwo(new char[]{'a', 'c', 'a', 'c', 'b'}));
    assertFalse(Solution.checkThreeAndTwo(new char[]{'a', 'a', 'a', 'a', 'a'}));
  }
}
