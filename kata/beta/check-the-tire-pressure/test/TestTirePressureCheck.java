import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestTirePressureCheck {
  @Test
  void testPressure() {
    assertEquals("Too low", TirePressure.checkPressure(200));
    assertEquals("Optimal", TirePressure.checkPressure(220));
    assertEquals("Too high", TirePressure.checkPressure(250));
  }
}