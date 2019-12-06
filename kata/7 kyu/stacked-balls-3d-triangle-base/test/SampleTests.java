import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {
  @Test
  public void test1() {
    assertEquals(1.0, Dinglemouse.stackHeight3d(1), .001);
  }

  @Test
  public void test2() {
    assertEquals(1.816, Dinglemouse.stackHeight3d(2), .001);
  }
}
