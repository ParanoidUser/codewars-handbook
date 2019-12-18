import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void simpleAddition() {
    assertEquals("H1H1FFFF00200000F4F4", StringPacket.communicationModule("H1H10F1200120008F4F4"));
  }

  @Test
  public void simpleSubtraction() {
    assertEquals("X7X7FFFF00820000L0L0", StringPacket.communicationModule("X7X7B7A201400058L0L0"));
  }

  @Test
  public void simpleMultiplication() {
    assertEquals("R5R5FFFF00960000K4K4", StringPacket.communicationModule("R5R5C3D900120008K4K4"));
  }
}
