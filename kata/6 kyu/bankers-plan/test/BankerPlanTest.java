import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankerPlanTest {
  @Test
  public void test1() {
    assertTrue(BankerPlan.fortune(100000, 1, 2000, 15, 1));
    assertFalse(BankerPlan.fortune(100000, 1, 9185, 12, 1));
    assertTrue(BankerPlan.fortune(100000000, 1, 100000, 50, 1));
    assertFalse(BankerPlan.fortune(100000000, 1.5, 10000000, 50, 1));
    assertTrue(BankerPlan.fortune(100000000, 5, 1000000, 50, 1));
  }
}
