import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BallTest {
  @Test
  void sample() {
    assertEquals(10, Ball.maxBall(37));
    assertEquals(13, Ball.maxBall(45));
    assertEquals(28, Ball.maxBall(99));
    assertEquals(24, Ball.maxBall(85));
  }
}
