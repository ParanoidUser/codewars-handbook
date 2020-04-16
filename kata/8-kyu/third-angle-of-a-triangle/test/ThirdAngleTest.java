import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThirdAngleTest {
  @Test
  public void testOtherAngle() {
    assertEquals(123, ThirdAngle.otherAngle(45, 12));
    assertEquals(70, ThirdAngle.otherAngle(50, 60));
  }
}
