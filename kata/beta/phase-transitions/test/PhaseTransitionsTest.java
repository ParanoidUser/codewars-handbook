import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PhaseTransitionsTest {
  @Test
  void solid_liquid_melt() {
    assertEquals("MELT", PhaseTransitions.getTransition("SOLID", "LIQUID"));
  }

  @Test
  void liquid_solid_freeze() {
    assertEquals("FREEZE", PhaseTransitions.getTransition("LIQUID", "SOLID"));
  }

  @Test
  void liquid_gas_boil() {
    assertEquals("BOIL", PhaseTransitions.getTransition("LIQUID", "GAS"));
  }
}
