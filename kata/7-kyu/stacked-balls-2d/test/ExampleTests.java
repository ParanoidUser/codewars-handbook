import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void test1() {
    assertEquals(1., Dinglemouse.stackHeight2d(1), .001);
  }

  @Test
  public void test2() {
    assertEquals(1.866, Dinglemouse.stackHeight2d(2), .001);
  }
}
