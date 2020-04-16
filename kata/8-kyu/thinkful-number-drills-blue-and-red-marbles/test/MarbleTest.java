import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MarbleTest {
  final double epsilon = 0.0000001;

  @Test
  public void pulledTest1() {
    assertTrue(Math.abs(BlueAndRedMarbles.guessBlue(5, 5, 2, 3) - 0.6) < epsilon);
  }

  @Test
  public void pulledTest2() {
    assertTrue(Math.abs(BlueAndRedMarbles.guessBlue(16, 12, 4, 9) - 0.8) < epsilon);
  }
}
