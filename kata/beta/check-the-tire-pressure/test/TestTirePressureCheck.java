import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTirePressureCheck {
  @Test
  public void testPressure() {
    assertEquals("Too low", TirePressure.checkPressure(200));
    assertEquals("Optimal", TirePressure.checkPressure(220));
    assertEquals("Too high", TirePressure.checkPressure(250));
  }
}