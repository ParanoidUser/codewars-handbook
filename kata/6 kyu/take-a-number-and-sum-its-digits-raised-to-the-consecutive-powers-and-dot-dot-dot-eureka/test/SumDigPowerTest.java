import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumDigPowerTest {
  @Test
  public void test() {
    assertThat(SumDigPower.sumDigPow(1, 10), hasItems(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L));
    assertThat(SumDigPower.sumDigPow(1, 100), hasItems(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L));
    assertThat(SumDigPower.sumDigPow(10, 100), hasItems(89L));
    assertThat(SumDigPower.sumDigPow(90, 150), hasItems(135L));
    assertThat(SumDigPower.sumDigPow(50, 150), hasItems(89L, 135L));
    assertThat(SumDigPower.sumDigPow(10, 150), hasItems(89L, 135L));
    assertTrue(SumDigPower.sumDigPow(90, 100).isEmpty());
  }
}
