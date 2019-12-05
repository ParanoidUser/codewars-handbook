import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertTrue(Kata.inviteMoreWomen(new int[] {1, -1, 1}));
    assertFalse(Kata.inviteMoreWomen(new int[] {-1, -1, -1}));
    assertFalse(Kata.inviteMoreWomen(new int[] {1, -1}));
    assertTrue(Kata.inviteMoreWomen(new int[] {1, 1, 1}));
  }
}
