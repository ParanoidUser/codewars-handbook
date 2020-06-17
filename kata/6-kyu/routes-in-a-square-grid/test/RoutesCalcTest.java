import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoutesCalcTest {
  @Test
  void sample() {
    assertEquals(0, RoutesCalc.calculateRoutes(-4));
    assertEquals(2, RoutesCalc.calculateRoutes(1));
    assertEquals(6, RoutesCalc.calculateRoutes(2));
    assertEquals(20, RoutesCalc.calculateRoutes(3));
    assertEquals(137846528820L, RoutesCalc.calculateRoutes(20));
  }
}