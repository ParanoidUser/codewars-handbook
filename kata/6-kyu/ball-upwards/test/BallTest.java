import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BallTest {
  @Test
  public void test() {
    assertEquals(10, Ball.maxBall(37));
    assertEquals(13, Ball.maxBall(45));
    assertEquals(28, Ball.maxBall(99));
    assertEquals(24, Ball.maxBall(85));
  }
}
