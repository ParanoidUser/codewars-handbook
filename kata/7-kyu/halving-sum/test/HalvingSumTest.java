import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HalvingSumTest {
  @Test
  public void test() {
    assertEquals(47, HalvingSum.halvingSum(25));
    assertEquals(247, HalvingSum.halvingSum(127));
  }
}
