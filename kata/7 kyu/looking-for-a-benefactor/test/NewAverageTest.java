import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NewAverageTest {
  @Test
  public void test() {
    assertEquals(628, NewAverage.newAvg(new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90));
    assertEquals(645, NewAverage.newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, 92));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIllegalArgumentException1() {
    NewAverage.newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, 2);
  }
}
