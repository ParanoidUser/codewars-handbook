import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void simpleOnes() {
    assertFalse(Bali.bearable(12, 0.99));
    assertTrue(Bali.bearable(32, 0.01));
  }
}
