import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhaseTransitionsTest {
  @Test
  public void solid_liquid_melt() {
    assertEquals("MELT", PhaseTransitions.getTransition("SOLID", "LIQUID"));
  }

  @Test
  public void liquid_solid_freeze() {
    assertEquals("FREEZE", PhaseTransitions.getTransition("LIQUID", "SOLID"));
  }

  @Test
  public void liquid_gas_boil() {
    assertEquals("BOIL", PhaseTransitions.getTransition("LIQUID", "GAS"));
  }
}
