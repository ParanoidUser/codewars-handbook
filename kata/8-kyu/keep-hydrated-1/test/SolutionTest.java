import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, new KeepHydrated().Liters(2));
    assertEquals(0, new KeepHydrated().Liters(0.97));
    assertEquals(7, new KeepHydrated().Liters(14.64));
    assertEquals(40, new KeepHydrated().Liters(80));
    assertEquals(800, new KeepHydrated().Liters(1600.20));
  }
}
