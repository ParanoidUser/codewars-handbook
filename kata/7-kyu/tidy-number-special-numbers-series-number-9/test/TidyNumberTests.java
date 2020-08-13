import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TidyNumberTests {
  @Test
  void sample() {
    assertTrue(Solution.tidyNumber(12));
    assertFalse(Solution.tidyNumber(32));
    assertTrue(Solution.tidyNumber(39));
    assertFalse(Solution.tidyNumber(1024));
    assertFalse(Solution.tidyNumber(12576));
    assertTrue(Solution.tidyNumber(13579));
    assertTrue(Solution.tidyNumber(2335));
  }
}
