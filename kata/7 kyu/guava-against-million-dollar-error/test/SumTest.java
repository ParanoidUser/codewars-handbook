import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {
  @Test
  public void basicTest() {
    assertEquals(5.0, Sum.sum(2.0, 3.0), 0.001);
  }

  @Test(expected = IllegalArgumentException.class)
  public void zeroTest() {
    assertEquals(3.0, Sum.sum(0.0, 3.0), 0.001);
  }

  @Test(expected = NullPointerException.class)
  public void basicTest1() {
    assertEquals(5.0, Sum.sum(null, 3.0), 0.001);
  }

  @Test(expected = NullPointerException.class)
  public void basicTest2() {
    assertEquals(5.0, Sum.sum(8.0, null), 0.001);
  }

  @Test(expected = IllegalArgumentException.class)
  public void basicTest3() {
    assertEquals(5.0, Sum.sum(-2.0, 3.0), 0.001);
  }

  @Test(expected = IllegalArgumentException.class)
  public void basicTest4() {
    assertEquals(5.0, Sum.sum(2.0, -3.0), 0.001);
  }
}
