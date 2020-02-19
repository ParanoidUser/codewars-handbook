import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VolTankTest {
  @Test
  public void test() {
    assertEquals(2940, VolTank.tankVol(5, 7, 3848));
    assertEquals(907, VolTank.tankVol(2, 7, 3848));
  }
}
