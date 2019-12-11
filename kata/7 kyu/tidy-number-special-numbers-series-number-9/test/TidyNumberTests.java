import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TidyNumberTests {
  @Test
  public void check_Small_Values() {
    assertTrue(Solution.tidyNumber(12));
    assertFalse(Solution.tidyNumber(32));
    assertTrue(Solution.tidyNumber(39));
  }

  @Test
  public void check_Larger_Values() {
    assertFalse(Solution.tidyNumber(1024));
    assertFalse(Solution.tidyNumber(12576));
    assertTrue(Solution.tidyNumber(13579));
    assertTrue(Solution.tidyNumber(2335));
  }
}
