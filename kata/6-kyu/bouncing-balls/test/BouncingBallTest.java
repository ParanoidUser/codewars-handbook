import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BouncingBallTest {
  @Test
  void sample() {
    assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    assertEquals(-1, BouncingBall.bouncingBall(3.0, 0, 1.5));
    assertEquals(-1, BouncingBall.bouncingBall(3.0, 1, 1.5));
    assertEquals(-1, BouncingBall.bouncingBall(1.5, 0.66, 3));
  }
}
