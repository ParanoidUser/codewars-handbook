import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GrassHopperTest {
  @Test
  public void test1() {
    assertEquals(1, GrassHopper.summation(1));
  }

  @Test
  public void test2() {
    assertEquals(36, GrassHopper.summation(8));
  }
}
