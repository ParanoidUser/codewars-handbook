import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, KeepHydrated.Liters(2));
    assertEquals(0, KeepHydrated.Liters(0.97));
    assertEquals(7, KeepHydrated.Liters(14.64));
    assertEquals(40, KeepHydrated.Liters(80));
    assertEquals(800, KeepHydrated.Liters(1600.20));
  }
}
