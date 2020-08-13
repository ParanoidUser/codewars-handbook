import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.inviteMoreWomen(new int[] {1, -1, 1}));
    assertFalse(Kata.inviteMoreWomen(new int[] {-1, -1, -1}));
    assertFalse(Kata.inviteMoreWomen(new int[] {1, -1}));
    assertTrue(Kata.inviteMoreWomen(new int[] {1, 1, 1}));
  }
}
